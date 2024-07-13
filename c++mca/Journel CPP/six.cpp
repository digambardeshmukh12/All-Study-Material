#include <iostream>
using namespace std;

template <typename T>
class Vector {
private:
T* arr;
int size;
public:
// Constructor to create the vector
Vector(int size) {
this->size = size;
arr = new T[size];
}

    // Function to modify the value of a given element
    void modifyElement(int index, T value) {
        if (index < size) {
            arr[index] = value;
        } else {
            cout << "Invalid index" << endl;
        }
    }

    // Function to multiply by a scalar value
    void multiplyByScalar(T scalar) {
        for (int i = 0; i < size; i++) {
            arr[i] *= scalar;
        }
    }

    // Function to display the vector
    void display() {
        cout << "(";
        for (int i = 0; i < size; i++) {
            cout << arr[i];
            if (i < size-1) {
                cout << ",";
            }
        }
        cout << ")" << endl;
    }
};
int main() {
Vector<int> v(4);
v.modifyElement(0, 10);
v.modifyElement(1, 20);
v.modifyElement(2, 30);
v.modifyElement(3, 40);
v.display();
v.multiplyByScalar(2);
v.display();
return 0;
}