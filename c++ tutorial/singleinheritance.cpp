#include <iostream>
using namespace std;
class base
{
    int data1;

public:
    int data2;
    void getdata();
    int setdata1();
    int setdata2();
};
void base::getdata()
{
    data1 = 10;
    data2 = 20;
}

int base::setdata1()
{
    return data1;
}

int base::setdata2()
{
    return data2;
}

class derived : public base
{
private:
    int data3;

public:
    void process();
    void display();
};

void derived::process()
{
    data3 = data2 * setdata2();
}

void derived::display()
{
    cout << "the value of data 1 is " << setdata2()<< endl;
    cout << "the value of data 2 is " << data2 << endl;
    cout << "the value of data 3 is " << data3 << endl;
}

int main()
{

    derived der;
    der.getdata();
    der.process();
    der.display();

    return 0;
}