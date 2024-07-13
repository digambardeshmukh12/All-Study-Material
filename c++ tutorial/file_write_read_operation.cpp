#include <iostream>
#include <fstream>
// #include<studio>
using namespace std;
int main()
{
    string xt = "the raj is devil";
    string xr;

    // ofstream out("rajout.txt");
    // out << xt;

    ifstream in("rajout.txt");
    // in >> xr;
    getline (in,xt);
    cout << xt;
    cout<<"the king is raj ";
    return 0;
} 