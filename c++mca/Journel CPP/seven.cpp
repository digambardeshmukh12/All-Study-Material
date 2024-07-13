#include<iostream>
#include<cstdlib>
using namespace std;
class Rational1
{
 int numerator,denominator;
public:
 Rational1();
 Rational1(int,int);
 Rational1 operator+(Rational1);
 Rational1 operator-(Rational1);
 Rational1 operator*(Rational1);
 Rational1 operator/(Rational1);
 bool operator>(Rational1);
 bool operator<(Rational1);
 bool operator>=(Rational1);
 bool operator<=(Rational1);
 bool operator==(Rational1);
 bool operator!=(Rational1);
 void printRational1();
 void reduce();
};
Rational1::Rational1(int n, int d) {
 numerator = n;
 denominator = d;
 if (d==0 || d<0)
 {
 	cout<<"Cannot enter zero or negative numbers for denominator"<<endl;
 	exit(1);
 }
 reduce();
}
Rational1::Rational1() {
 numerator = 0;
 denominator =1;
}
Rational1 Rational1::operator+(Rational1 a) {
 Rational1 t;
 t.numerator = a.numerator * denominator + a.denominator * numerator;
 t.denominator = a.denominator * denominator;
 t.reduce();
 return t;
}
Rational1 Rational1::operator-(Rational1 s) {
 Rational1 t;
 t.numerator = s.denominator * numerator - denominator * s.numerator;
 t.denominator = s.denominator * denominator;
 t.reduce();
 return t;
}
Rational1 Rational1::operator*(Rational1 m) {
 Rational1 t;
 
 t.numerator = m.numerator * numerator;
 t.denominator = m.denominator * denominator;
 t.reduce();
 return t;
}
Rational1 Rational1::operator/(Rational1 v) {
 Rational1 t;
 t.numerator = v.denominator * numerator;
 t.denominator = denominator * v.numerator;
 t.reduce();
 return t;
}
bool Rational1::operator>(Rational1 v) {
 float f1=numerator/float(denominator);
 float f2=v.numerator/float(v.denominator);
 if(f1>f2)
 return true;
 else return false;
}
bool Rational1::operator<(Rational1 v) {
 float f1=numerator/float(denominator);
 float f2=v.numerator/float(v.denominator);
 if(f1<f2)
 return true;
 else return false;
 }
bool Rational1::operator>=(Rational1 v) {
 float f1=numerator/float(denominator);
 float f2=v.numerator/float(v.denominator);
 if(f1>=f2)
 return true;
 else return false;
 }
bool Rational1::operator<=(Rational1 v) {
 float f1=numerator/float(denominator);
 float f2=v.numerator/float(v.denominator);
 if(f1<=f2)
 return true;
 else
 return false;
 }
bool Rational1::operator==(Rational1 v) {
 float f1=numerator/float(denominator);
 float f2=v.numerator/float(v.denominator);
 if(f1==f2)
 return true;
 else
 return false;
}
bool Rational1::operator!=(Rational1 v) {
 float f1=numerator/float(denominator);
 float f2=v.numerator/float(v.denominator);
 if(f1!=f2)
 return true;
 else return false;
}
void Rational1::printRational1() {
 if (denominator == 0)
 cout << endl << "DIVIDE BY ZERO ERROR!!!" << endl;
 else if (numerator == 0)
 cout << 0;
 else
 cout << numerator << "/" << denominator;
}
void Rational1::reduce() {
 int n = numerator < 0 ? -numerator : numerator;
 int d = denominator;
 int largest = n > d ? n : d;
 int gcd = 0; 
 for (int loop = largest; loop >= 2; loop--)
 if (numerator % loop == 0 && denominator % loop == 0) {
 gcd = loop;
 break;
 }
 if (gcd != 0) {
 numerator /= gcd;
 denominator /= gcd;
 }
}
int main()
{
Rational1 r1,r2,r3;
int n,d;
int choice;
char ch;
cout<<"Enter in format :numerator <space> denominator\n";
cout<<"Enter first Rational1 number - numerator and denominator\t: ";
cin>>n>>d;
r1=Rational1(n,d);
cout<<"Enter second Rational1 number - numerator and denominator\t:";
cin>>n>>d;
r2=Rational1(n,d);
do
{
 cout<<"**********MENU***********\n";
 cout<<"1. +\t2. -\t3.*\t4. /\t5. >\t6. <\n7. >=\t8. <=\t9. !=\t10. ==";
 cout<<"\n11. Print\t12.Exit\n";
 cout<<"Enter your choice";
 cin>>choice;
 switch(choice)
 {
 case 1:
 r3=r1+r2;
 r3.printRational1();
 break;
 case 2:
 r3=r1-r2;
 r3.printRational1();
 break;
 case 3:
 r3=r1*r2;
 r3.printRational1();
 break;
 case 4:
 r3=r1/r2;
 r3.printRational1();
 break;
 case 5:
 if(r1>r2)
 {
 r1.printRational1();
 cout<<" is greater than ";
 r2.printRational1();
 }
 else
 {
 r1.printRational1();
 cout<<" is not greater than ";
 r2.printRational1();
 }
 break;
 case 6:
 if(r1<r2)
 {
 r2.printRational1();
 cout<<" is greater than ";
 r1.printRational1();
 }
 else
 {
 r2.printRational1();
 cout<<" is not greater than ";
 r1.printRational1();	
 }
 break;
 case 7:
 if(r1>=r2)
 {
 r1.printRational1();
 cout<<" is greater than or equal to ";
 r2.printRational1();
 }
 else
{
 r1.printRational1();
 cout<<" is not greater than or equal to ";
 r2.printRational1();
 }
 break;
 case 8:
 if(r1<=r2)
 {
 r2.printRational1();
 cout<<" is greater than or equal to ";
 r1.printRational1();
 }
 else
 {
 r2.printRational1();
 cout<<" is not greater than or equal to ";
 r1.printRational1();
 }
 break;
 case 9:
 if(r1!=r2)
 {
 r1.printRational1();
 cout<<" is not equal to ";
 r2.printRational1();
 }
 else
{
 r1.printRational1();
 cout<<" is  equal to ";
 r2.printRational1();
 }
 break;
 case 10:
 if(r1==r2)
 {
 r1.printRational1();
 cout<<" is equal to ";
 r2.printRational1();
 }
 else
 {
 r1.printRational1();
 cout<<" is not equal to ";
 r2.printRational1();
 }
 break;
 case 11:
 cout<<"\nFirst Rational Number\n";
 r1.printRational1();
 cout<<"\nSecond Rational Number\n";
 r2.printRational1();
 cout<<"\nThird Rational Number\n";
 r3.printRational1();
 break;
 case 12:
 exit(0);;
 }
cout<<"\nDo you want to continue(y/n)\n";
cin>>ch;
}while(ch=='y' || ch=='Y');
return 0;
}
 