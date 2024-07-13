#include<iostream>
using namespace std;

class A {
	
	public:
		int a , b ;
		
		void add(int a,int b){
			this->a= a;
			this->b= b;
		cout<<"Address of object "<<this<<endl;
		cout<<"Value of a "<<a<<" And B "<<b<<endl;
			
		}
			
};

int main(){
	A Obj;
	Obj.add(23,45);
	return 0;
}