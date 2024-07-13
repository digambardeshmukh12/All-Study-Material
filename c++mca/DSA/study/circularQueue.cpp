#include <iostream>
using namespace std;

const int MAX_SIZE = 10; 

class CircularLinkedList {
    int arr[MAX_SIZE];
    int size; 
    int front; 
    int rear; 
public:
    CircularLinkedList() {
        size = 0;
        front = 0;
        rear = -1;
    }

    bool isFull() {
        return size == MAX_SIZE;
    }

    bool isEmpty() {
        return size == 0;
    }

    void insert(int data) {
        if (isFull()) {
            cout << "Error: Circular linked list is full." << endl;
            return;
        }
        rear = (rear + 1) % MAX_SIZE; 
        arr[rear] = data;
        size++;
    }

    void remove() {
        if (isEmpty()) {
            cout << "Error: Circular linked list is empty." << endl;
            return;
        }
        front = (front + 1) % MAX_SIZE; 
        size--;
    }

    void display() {
        if (isEmpty()) {
            cout << "Circular linked list is empty." << endl;
            return;
        }
        cout << "Circular linked list: ";
        int i = front;
        do {
            cout << arr[i] << " ";
            i = (i + 1) % MAX_SIZE;
        } while (i != (rear + 1) % MAX_SIZE);
        cout << endl;
    }
};

int main() {
    CircularLinkedList list;
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.insert(5);
    list.insert(6);
    list.insert(7);
    list.insert(8);
    list.insert(9);
    list.insert(10);
    list.insert(11);
    list.insert(12);
    list.display(); 
    list.remove();
    list.display();
    list.remove();
    list.display(); 
    list.insert(11);
    list.display(); 
    return 0;
}
