#include <iostream>
using namespace std;
class shop
{

    int id;
    int rate;

public:
    void setdata(int a, int b)
    {

        id = a;
        rate = b;
    }

    void getdada(void)
    {
        cout << "the id of the product is " << id << endl;
        cout << "the price of the product is " << rate << endl;
    }
};
int main()
{
    int size = 3;
    shop *pen = new shop[size];
    shop *pentemp = pen;
    int p, q, i;

    for (i = 0; i < size; i++)
    {
        cout << "enter id and prize of product  " << i + 1 << endl;
        cin >> p >> q;
        pen->setdata(p, q);
        pen++;
    }
    for (i = 0; i < size; i++)
    {
        cout << "product no:" << i + 1 << endl;
        pentemp->getdada();
        pentemp++;
    }
    return 0;
}