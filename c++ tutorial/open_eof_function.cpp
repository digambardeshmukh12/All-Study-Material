#include <iostream>
#include <fstream>
#include<string>
using namespace std;
int main()
{

    // ofstream out;
    // out.open("rajout.txt");

    // out<<"the raj is real  lucifer \n ";
    // out<<"and he is a king of hell \n";
    // out<<"raj start war with god  \n";
    // out.close();

    ifstream in;
    in.open("rajout.txt");
    string st2;
    in>>st2 ;
    while (in.eof()==0)
    {
        getline(in , st2 ) ;
        cout<<st2;
    }
    
    in.close();

    return 0;
}