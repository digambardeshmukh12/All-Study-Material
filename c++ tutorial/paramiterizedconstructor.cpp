#include<iostream>
using namespace std;
class complex{
int a,b;

public:

 complex( int, int);

void printdata(){

    cout<<"the equation of a and b is "<< a <<" + "<< b<<"i" <<endl;
}
};
complex::complex(int x ,int y ){
a=x;
b=y;

}
int main(){
complex c1(53,54),c2(53,63),c3(43,63);
c1.printdata();
c2.printdata();
c3.printdata();
return 0;
}