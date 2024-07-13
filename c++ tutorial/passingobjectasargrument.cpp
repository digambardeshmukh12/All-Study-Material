#include<iostream>
using namespace std;
class example {
public:
 int a;
 void add(example E){

a=a+E.a;
}

};
int main()
{
 example E1,E2;
 E1.a=10;
 E2.a=20;
 cout<<"initial values \n";
 cout<<"value of objects 1:"<<E1.a<<"\n& objects 2:"<<E2.a<<"\n\n";
    E2.add(E1);
    
    
    cout<<"new values \n";
 cout<<"value of objects 1:"<<E1.a<<"\n& objects 2:"<<E2.a<<"\n\n";
    
    return 0;
}