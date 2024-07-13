#include <iostream>
#include <cstring>
using namespace std;
class hac
{

protected:
    string tital;
    float rating;

public:
    hac(string tl, float r)
    {
        tital = tl;
        rating = r;
    }

    virtual void printdata()
    {
    }
};

class hacvideo : public hac
{
protected:
    float videolength;

public:
    hacvideo(string tl, float r, float vl) : hac(tl, r)
    {
        videolength = vl;
    }

    void printdata()
    {
        cout << "the name of video is " << tital << endl;
        cout << "the rating for thid video  " << rating << endl;
        cout << "the length of video is " << videolength << endl;
    }
};

class hacwriten : public hac
{
protected:
    int words;

public:
    hacwriten(string tl, float r, int wl) : hac(tl, r)
    {
        words = wl;
    }
    void printdata()
    {
        cout << "the name of tutorial is " << tital << endl;
        cout << "the rating for the tutorial " << rating << endl;
        cout << "the words in this tutorial " << words << endl;
    }
};

int main()
{
    string tital;
    float rating, val;
    int words;

    tital = "the lucifer ";
    rating = 4.3;
    val = 54.47;

    hacvideo video(tital, rating, val);
    // video.printdata();

    tital = "the lucifer in books ";
    rating = 4.2;
    words = 747;

    hacwriten tutorial(tital, rating, words);
    // tutorial.printdata();
    hac* tut[2];
    tut[0] = &video;
    tut[1] = &tutorial;
 
    tut[0]->printdata();
    tut[1]->printdata();


return 0 ;
}
