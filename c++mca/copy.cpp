#include<iostream>
using namespace std ;

class A {
	public :
	int a , b ;
	
	A(int x , int y ){
		a = x ;
		b = y ;
		
	}
	
	void show(){
		cout<<"Value of a "<< a <<" and value of B "<<b<<endl;
		
	}
	
	A(A &i){
		a = i.a;
		b = i.b;
	}
	
};

int main(){
	
	A a1(20,30);
	A a2 = a1;
	
	a1.show();
	a2.show();
	
	return 0 ;
}