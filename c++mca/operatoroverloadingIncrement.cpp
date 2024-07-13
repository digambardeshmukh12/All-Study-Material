#include <iostream>

using namespace std;

class Counter {
private:
    int count;
public:
    Counter() {
	count = 0 ;
	}
    Counter(int c) {
		count = c;
	}

    // Prefix increment operator overloading
    Counter operator++() {
        ++count;
        return Counter(count);
    }

    // Prefix decrement operator overloading
    Counter operator--() {
        --count;
        return Counter(count);
    }

    // Postfix increment operator overloading
    Counter operator++(int) {
        Counter temp(count);
        ++count;
        return temp;
    }

    // Postfix decrement operator overloading
    Counter operator--(int) {
        Counter temp(count);
        --count;
        return temp;
    }

    void display() {
        cout << "Count: " << count << endl;
    }
};

int main() {
    Counter c1(5);
    Counter c2;

    c2 = ++c1; // Prefix increment
    c1.display();
    c2.display();

    c2 = --c1; // Prefix decrement
    c1.display();
    c2.display();

    c2 = c1++; // Postfix increment
    c1.display();
    c2.display();

    c2 = c1--; // Postfix decrement
    c1.display();
    c2.display();

    return 0;
}
