#include<iostream>
using namespace std;
class  complex
{
private:
    int a;
    int b;
public:
     complex(void);

     void printdata(){

         cout<<"the sum of a and b is "<<a<<"i+"<<b<<"i "<<"is "<<a<<"i+s"<<+b<<"i" <<endl;
     }
};

 complex::complex(void){
a=20;
b=52;

 }
int main(){
complex c1,c2,c3;
c1.printdata();
c2.printdata();
c3.printdata();
return 0;

}
