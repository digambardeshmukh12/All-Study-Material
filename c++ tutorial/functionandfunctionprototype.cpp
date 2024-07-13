#include<iostream>
using namespace std;
int sum(int a,int b);
void g(void);

// a and b are formal paramiters
int main()
{
 int num1 ,num2 ;
 cout<<"enter num1"<<endl;
 cin>>num1;
 cout<<"enter num2"<<endl;
 cin>>num2;
 cout<<"the sum is "<<sum(num1,num2)<<endl;
   g();
 // num1 and num2 are actual paramiters 
    return 0;
 

} 
int sum(int a,int b)
{
int c=a+b;
return c;
}
 
void g(){
 cout<<"hii";
}
 