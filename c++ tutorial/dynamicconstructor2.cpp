#include<iostream>
using namespace std;
class complex{
int a,b,c;
double C;
public:
 complex(int x,int y,int z){

a=x;
b=y;
c=z;
int p=a*b*c;
cout<<"the product of a,b & c is "<<p<<endl;

}
 complex(int x,int y ,double z){

     a=x;
     b=y;
     C=z;
     double p=a*b*C;
     cout<<"the product of a,b & c is "<<p<<endl;

 }

};
int main(){

 complex ram(43,73,73),sam(653,64,83),kam(3,63,6.4);
return 0;
}