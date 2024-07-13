#include<iostream>
using namespace std;
int main()
{
int a=2;
int*b=&a;
cout<<"address of b is:"<<b<<endl;
// & --> (address of ) operator
cout<<"address of b is:"<<&a<<endl;

// * ----> dereference operator (that gives value)
cout<<"value of b is:"<<*b<<endl;

//pointer to pointer 
int**c;
c=&b;

cout<<"address of b is:"<<c<<endl;
cout<<"address of b is:"<<&b<<endl;
cout<<"value of a is:"<<**c<<endl;


    return 0;
}