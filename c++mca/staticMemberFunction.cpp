#include<iostream>
using namespace std ;
class staticFunction{
static int count ;
public:
	void fun(){
		int a = 10 ;
		cout<<a<<endl;
		
	}	
	static void fun1(){
		cout<<"Static Member Function "<<count<<endl;
		
	}
};

int staticFunction :: count;

int main(){
	
	staticFunction obj ;
	obj.fun();
	staticFunction :: fun1();
	return 0 ;
}