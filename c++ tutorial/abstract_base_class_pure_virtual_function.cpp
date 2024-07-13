#include<iostream>
#include<string>
using namespace std ;
class raj { 
    protected:
,
    string tital ;
    float rating ;
     
     public :
     raj(string tl , float r){
         tital = tl ;
         rating = r ;
     }

      virtual  void printdata() = 0 ;// in this syntax printdata function complasary -
    //  -  to re-write in derived class 

};

class video:public raj{
    protected:
     float videolength ;
    public :
    video (string tl , float r ,float vl ):raj (tl , r){
        videolength= vl ;

    }
    void printdata(){

        cout<<"the name of video "<<tital<<endl;
        cout<<"the rating of video "<<rating<<endl;
        cout<<"the length of video "<<videolength<<endl;

    }
};
class text:public raj{
    protected :
    int words ;
    public :
    text(string tl ,float r ,int w):raj(tl,r){
        words = w ;
    }
    void printdata(){

        cout<<"the name tutorial "<<tital<<endl;
        cout<<"the rating of  tutorial "<<rating<<endl;
        cout<<"the words in tutorial "<<words<<endl;

    }
};
int main(){
    string tital;
    float rating , val ;
    int words ;

    tital ="the lucifer siries ";
    rating = 4.6;
    val=45.44;
    video obj_video(tital,rating,val);


    tital="the lucifer series in bibal ";
    rating =3.4 ;
    words =546 ;
    text obj_text(tital , rating , words );

    raj* tut[2];
    tut[0]=&obj_video;
    tut[1]=&obj_text ;

    tut[0]->printdata();
    tut[1]->printdata();

    return 0 ;

}
