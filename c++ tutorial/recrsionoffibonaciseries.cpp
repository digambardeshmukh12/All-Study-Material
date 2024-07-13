#include<iostream>
using namespace std;
int raj( int a){
if(a<2){
 
return 1;

}
 return raj(a-2)+raj(a-1);

}
/*  Fibonacci Sequence म्हणजे या लिंक वर पाहा
   https://www.mathsisfun.com/numbers/fibonacci-sequence.html 
       
    1,1,2,3,5,8,13,21....
     जसे आता 13 नंतर 21 आले पुढील नंबर साठी 
     13+21=34  आहे 
    
    */

int main()
{
    int b=41;
    
    cout<<raj(b);

    return 0;
}