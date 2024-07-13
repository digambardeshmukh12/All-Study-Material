#include<iostream>
using namespace std;
class quadratic {
    int a,b;
public:
    friend quadratic equation(quadratic o1, quadratic o2);
    void getdata(int v1,int v2) {
        a=v1;
        b=v2;
    }
    void printdata(void) {
        cout<<"the equation is "<<a<<" + "<<b<<"x"<<endl;
    }
};
quadratic equation(quadratic o1, quadratic o2) {
    quadratic o3;
    o3.getdata(( o1.a+o2.a),(o1.b+o2.b));
    return o3;
}
int main()
{
    quadratic c,d,e ;

    c.getdata(2,3);
    c.printdata();

    d.getdata(4,5);
    d.printdata();

    e=equation(c,d);
    e.printdata();
    return 0;
}