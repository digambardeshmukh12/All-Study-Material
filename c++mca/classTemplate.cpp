#include<iostream>
using namespace std ;
template<class t, class t2>
class cla{
	public:
		t a; 
		t2 b ;
		cla(t x , t2 z){
			a= x ;
			b = z;
		}
		
		t2 display(){
			return a+b;
		}
		
};

int main(){
	
	cla<int , float> obj(656,55.5f);
	cout<<obj.display();

	return 0 ;
	
}