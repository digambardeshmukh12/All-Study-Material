#include <iostream>
using namespace std;

class raj
{
    int data1;

public:
    int data2;

    void setdata();
    int getdata1();
    int getdata2();
};
void raj::setdata()
{
    cout << "enter the first value " << endl;
    cin >> data1;
    cout << "enetr the secound value " << endl;
    cin >> data2;
}

int raj::getdata1()
{

    return data1;
}
int raj ::getdata2()
{

    return data2;
}
class deshmukh : public raj
{
    int data3;

public:
    void sequence();
    void printdata();
};
void deshmukh::sequence()
{
    data3 = data2 * getdata1();
}

void deshmukh::printdata()
{

    cout << "the value of first object is " << getdata1() << endl;
    cout << "the value of secound object is " << data2 << endl;
    cout << "the value of third object is " << data3 << endl;
}
int main()
{

    deshmukh x;
    x.setdata();
    x.sequence();
    x.printdata();

    return 0;
}