#include <iostream>
using namespace std;
class base1
{
protected:
    int a2;

public:
    base1(int x)
    {
        a2 = x;
        cout << "the constructor is called in base1 " << endl;
    }

    void prtb1(){
        cout<<"the value of a2 is "<<a2<<endl;
    }
};

class base2
{
protected:
    int b2;

public:
    base2(int y)
    {
        b2 = y;
        cout << "constructor is call in base2" << endl;
    }
     void prtb2(){
        cout<<"the value of b2 is "<<b2<<endl;
    }
};

class derived : public base1, public base2
{
protected:
    int derived1;
    int derived2;

public:
    derived(int a, int b, int c, int d) : base1(a), base2(b)
    {
        derived1 = c;
        derived2 = d;
        cout<<"constructor in derived class "<<endl;
    }
    void ptrd(){

        cout<<"the value of derived1 is "<<derived1<<endl;
        cout<<"the value of derived2 is "<<derived2<<endl;

    }
};

int main()
{

derived raj(2,3,4,5);
raj.prtb1();
raj.prtb2();
raj.ptrd();
    

    return 0;
}