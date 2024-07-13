#include <iostream>
using namespace std;
class employe {
 int a,b;
 public:
 void getdata (int a, int b);
void printdata(void){

    cout<<"enter the value of a is   "<< a <<"  and b is  "<<  b <<endl;
    
    
    }

};

void employe::getdata(int x,int y){
a=x;
b=y;

}

int main()
{

employe raj;
raj.getdata(43,76);
raj.printdata();
    
    return 0;
}
