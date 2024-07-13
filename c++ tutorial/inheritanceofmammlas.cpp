#include <iostream>
using namespace std;
class mammals
{
public:
    int hands;
    int eyes;
    mammals(int x, int y)
    {
        hands = x;
        eyes = y;
    }
    mammals() {}
    void getdata()
    {

        cout << "enter the value of hands and eyes " << endl;
        cin >> hands;
        cin >> eyes;
    }
};
class human : public mammals
{
public:
    int legs;
    int teath;
    human() {}
    human(int a, int b)
    {
        legs = a;
        teath = b;
    }
    void setdata()
    {
        cout << "enter the value of legs and teath of human" << endl;
        cin >> legs;
        cin >> teath;
    }
};
int main()
{
    mammals x1;
    x1.getdata();

    human x2, x3;
    x2.getdata();
    x2.setdata();

    x3.getdata();
    x3.setdata();
    return 0;
}
