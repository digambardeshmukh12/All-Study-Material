#include <iostream>
using namespace std;
class eng
{
public:
    void show()
    {
        cout << "raj is the devil " << endl;
    }
};

class raj : public eng
{

public:
    void show()
    {
        cout << "raj shaitan hai " << endl;
    }
};

int main()
{
    eng y;
    y.show();

    raj x;
    x.show();
}