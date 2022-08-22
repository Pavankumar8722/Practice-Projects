#include<iostream>
#include<fstream>
#include<string>
using namespace std;
bool Isloggedin()
{
    string username,password , un, pw;
    cout<<"Enter user name : ";
    cin>>username;
    cout<<"Enter password : ";
    cin>>password;

    fstream read("S:\\"+username + ".txt");
    getline(read,un);
    getline(read,pw);
    if(un==username && pw == password)
    {

        return true;
    }
    else {
        return false;
    }
}
 int main()
 {

     int choice;
      cout<<"1: Register\n 2: Login \n Your choice : ";
      cin>>choice;
      if(choice==1)
      {

          string username,password;
           cout<<" Enter a name : ";
           cin>>username;
           cout<<"Enter a password :";
           cin>>password;

           ofstream file;
           file.open("S:\\"+username+".txt");
           file<<username<<endl<<password;
           file.close();
           main();
      }

      else if(choice==2)
        {
        bool status = Isloggedin();

        if(!status)
        {

            cout<<"False login!"<<endl;
            system("PAUSE");
            return 0;

        }
        else {
            cout<<"Successfully logged in "<<endl;
            system("PAUSE");
            return 1;
        }
      }
 }



