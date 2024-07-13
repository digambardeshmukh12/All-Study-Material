#include<iostream>
using namespace std;

class quadratic;
class employe {
public:
    int add(int a,int b ) {

        return (a+b);
    }

    int sumequ(quadratic, quadratic);
    int sumeq(quadratic, quadratic);
};

class quadratic {
    int a,b;
public:
    /* friend int employe :: sumequ(quadratic, quadratic );
    friend int employe :: sumeq(quadratic, quadratic );
    */
    friend class  employe;
    void getdata(int v1,int v2) {
        a=v1;
        b=v2;
    }
    void printdata(void) {
        cout<<"the equation is "<<a<<" + "<<b<<"x"<<endl;
    }
};


int employe :: sumequ(quadratic o1, quadratic o2) {
    return (o1.a + o2.a);
}
int employe :: sumeq(quadratic o1, quadratic o2) {
    return (o1.b + o2.b);
}
int main()
{
    quadratic x,y;
    x.getdata(2,6);
    y.getdata(3,4);

    employe h, j;
    int z=h.sumequ(x,y);
    cout<< z <<endl;
    int c=j.sumeq(x,y);
    cout<< c <<endl;
    return 0;
}