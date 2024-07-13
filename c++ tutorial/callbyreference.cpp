#include<iostream>
using namespace std;
int  raj(int &a,int &b){
int c=a;
    a=b;
    b=c;
    
    return a;
}
int main()
{
 int x=10;
 int y=20;
 raj(x,y) ;

 cout<< x<<"&"<<y<<endl;
    
    return 0;
}