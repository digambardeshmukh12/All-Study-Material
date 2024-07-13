#include<iostream>
#include<fstream>
using namespace std ;
int main(){

    ofstream out("rajout.txt");
    string st , pt ;

    pt="who is lucifer ";
    st="the raj is lucifer ";
    out<<pt + st;

    out.close();

    ifstream in("rajout.txt");
    string st2;
    
    getline(in , st2 );
    getline(in , st2 );
     
    in>>st2;
    cout<<st2;
    in.close();

    return 0 ;

}