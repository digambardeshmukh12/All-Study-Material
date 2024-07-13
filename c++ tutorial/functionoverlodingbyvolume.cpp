#include<iostream>
using namespace std;
int volume(int l ){
return l*l ;
}
int volume(int r,int h){
return 3.14*r*r*h;
}
double volume(double r ){
return 3.14*r*r;
}
int main()
{
cout<<"volume of square "<< volume(4)<<endl;
cout<<"volume of cylinder "<< volume(10,5)<<endl;  
cout<<"area of circle "<< volume(3.12)<<endl;  
  return 0;
}