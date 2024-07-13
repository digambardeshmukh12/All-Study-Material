#include <iostream>
#include <fstream>
using namespace std;

int main() {
    int count = 0;
    string line;
    ifstream file("Karna.TXT");

    if (file.is_open()) {
        while (getline(file, line)) {
            if (line.empty() || line[0] != 'A') {
                count++;
            }
        }
        
        cout << "Number of lines not starting with 'A': " << count << endl;
        file.close();
    } else {
        cout << "Unable to open file";
    }

    
    return 0;
}
