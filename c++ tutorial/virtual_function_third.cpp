#include <iostream>
#include <string>
using namespace std;
class raj
{
protected:
    float rating;
    string tital;

public:
    raj(string tl, float r)
    {
        rating = r;
        tital = tl;
    }
    virtual void printdata()
    {
    }
};

class video : public raj
{
protected:
    int videolength;

public:
    video(string tl, float r, int vl) : raj(tl, r)
    {
        videolength = vl;
    }
    void printdata()
    {
        cout << "the tital of video is  " << tital << endl;
        cout << "the rating  of video is  " << rating << endl;
        cout << "the length  of video is  " << videolength << endl;
    }
};

class text : public raj
{

protected:
    int words;

public:
    text(string tl, float r, int wr) : raj(tl, r)
    {
        words = wr;
    }
    void printdata()
    {
        cout << "the tital of tutorial is  " << tital << endl;
        cout << "the rating  of tutorial is  " << rating << endl;
        cout << "the length  of tutorial is  " << words << endl;
    }
};

int main()
{
    string tital;
    int words;
    float rating, val;

    tital = "the hell king lucifer ";
    rating = 4.9;
    val = 54.45;

    video obj_video(tital, rating, val);
    // obj_video.printdata();

    tital = "the hell king lucifer by bibal  ";
    rating = 4.4;
    words = 645;
    text obj_text(tital, rating, words);
    // obj_text.printdata();

    raj *tut[2];
    tut[0] = &obj_video;
    tut[1] = &obj_text;

    tut[0]->printdata();
    tut[1]-> printdata();
    return 0;
}