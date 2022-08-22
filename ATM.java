import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  int balance = 5000;
	  Scanner sc = new Scanner(System.in);
	  
	  while(true){
	      System.out.println(" Welcome ");
          System.out.println("Press 1 for Balance ");
          System.out.println("Press 2 for withdraw");
          System.out.print("Press 3 for Deposite ");
          System.out.print("Press 4 for Exit ");
          System.out.print("Enter your option : ");
          
          int choice = sc.nextInt();
   
          switch(choice){
              
        
              case 1 :
                  System.out.printf(" The available balance is : "+ balance);
                  break ;
                  
              case 2:
                  System.out.printf("Enter the amount : ");
                  int amount = sc.nextInt();
                  if(amount>balance)
                  {
                      System.out.printf("Insufficent balance ");
                      break;
                  }
                  else
                  {
                      balance=-amount;
                      System.out.printf("Collect your money");
                  }
                    break;
                    
              case 3:
                  System.out.printf("Enter the amount : ");
                  int deposite =sc.nextInt();
                  balance=+deposite;
                  System.out.printf("Your Money has been successfully deposited");
                  break;
            
              case 4:
                  System.exit(0);
                  
                default :
                    System.out.printf("Invalid option");
            }   
         }
	  }
 }