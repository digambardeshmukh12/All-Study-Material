#include <iostream>
using namespace std;
class student
{
protected:
    int roll_number;

public:
    void setrollnumber()
    {
        cout << "enter the roll number  of student " << endl;
        cin >> roll_number;
    }

    void printrollnumber()
    {
        cout << "the roll number of student  is " << roll_number << endl;
    }
};

class test : virtual public student
{

protected:
    int math;
    int physics;

public:
    void setmarks()
    {
        cout << "enter the marks of math are " << endl;
        cin >> math;
        cout << "enter the marks of physics  are " << endl;
        cin >> physics;
    }

    void printmarks()
    {
        cout << "the obtain marks of student is "
             << "  math: " << math
             << "  physics: " << physics << endl;
    }
};

class sport : virtual public student
{
protected:
    int score;

public:
    void setscore()
    {
        cout << "enter the score in cricket " << endl;
        cin >> score;
    }

    void printscore()
    {
        cout << "the score of student in cricker " << score << endl;
    }
};

class result : public test, public sport
{

protected:
    int total;

public:
    void setreasult()
    {
        

        setrollnumber();
        printrollnumber();
        setmarks();
        printmarks();
        setscore();
        printscore();
        total = math + physics + score;
    }

    void printresult()
    {
        cout << "the total marks of student out of 200 are " << total << endl;
    }
};

int main()
{
    result x1;
    x1.setreasult();
    x1.printresult();
    return 0;
}