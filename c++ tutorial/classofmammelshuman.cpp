#include<iostream>
using namespace std;
class mammals{
private:
int legs, eye,teath;
public:
int nose,mouth;
  
     void comedata(int legs1,int eye1,int teath1) ;
//      {
// legs=legs1;
// eye=eye1;
// teath=teath1;
// }

     void godata(){
        
        cout<<"the number of legs  "<<legs <<endl;
        cout<<"the number of eyes  "<<eye <<endl;
        cout<<"the number of teath  "<<teath <<endl;
        cout<<"the number of nose  "<<nose <<endl;
        cout<<"the number of mouth  "<<mouth <<endl;
        }
};
void mammals:: comedata(int legs1,int eye1,int teath1){
legs=legs1;
eye=eye1;
teath=teath1;
}

int main()
{
 mammals human;
 human.nose=1;
 human.mouth=1;
 human.comedata(2,2,32);
 human.godata();
    
    return 0;
}