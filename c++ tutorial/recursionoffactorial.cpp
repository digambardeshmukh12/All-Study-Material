#include<iostream>
using namespace std;
int raj( int a){
if(a>=1){
 
return 1;

}
 return a*raj(a-1);

}

int main()
{
    int b= 5;
    cout<<" the factorial of "<< b<< " is "<< raj(b);

    return 0;
}