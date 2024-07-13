#include <iostream>
using namespace std;

class CppArray {
private:
    int *arr;
    int size;

public:
    CppArray(int n) {
        arr = new int[n];
        size = n;
    }

    ~CppArray() {
        delete[] arr;
    }

    int operator[](int index) {
        if (index < 0 || index >= size) {
            cout << "Index out of range" << endl;
            exit(1);
        }
        return arr[index];
    }

    CppArray& operator=(const CppArray& other) {
        if (this != &other) {
            size = other.size;
            delete[] arr;
            arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = other.arr[i];
            }
        }
        return *this;
    }
    int getSize() {
        return size;
    }
    friend istream& operator>>(istream& in, CppArray& array) {
        for (int i = 0; i < array.size; i++) {
            in >> array.arr[i];
        }
        return in;
    }
    friend ostream& operator<<(ostream& out, CppArray& array) {
        for (int i = 0; i < array.size; i++) {
            out << array.arr[i] << " ";
        }
        return out;
    }
};
int main() {
	int n ;
	cout<<"Enter the size of array : ";
	cin>>n ;
	cout<<"Enter the Elements in array : ";
    CppArray cp1(n);
    cin >> cp1;
    cout <<"\nSize of Array is "<< cp1.getSize() << endl;
    cout << cp1;
    CppArray cp2(n);
    cp2 = cp1 ;
    cout<<"\nSize of coppid array : "<<cp2.getSize()<<endl;
    cout<<"copied arry : "<<cp2<<endl;
     return 0;
}
