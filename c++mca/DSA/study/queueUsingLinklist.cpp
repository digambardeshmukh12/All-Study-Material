#include <iostream>

using namespace std;

class Node {
    public:
        int data;
        Node* next;
        Node(int d) {
            data = d;
            next = nullptr;
        }
};

class Queue {
    private:
        Node* front;
        Node* rear;
    public:
        Queue() {
            front = nullptr;
            rear = nullptr;
        }

        bool isEmpty() {
            return (front == nullptr);
        }

        void enqueue(int x) {
            Node* temp = new Node(x);
            if (rear == nullptr) {
                front = rear = temp;
                return;
            }
            rear->next = temp;
            rear = temp;
        }

        void dequeue() {
            if (front == nullptr) {
                return;
            }
            Node* temp = front;
            front = front->next;
            if (front == nullptr) {
                rear = nullptr;
            }
            delete temp;
        }

        int peek() {
            if (front == nullptr) {
                return -1;
            }
            return front->data;
        }

        void display() {
            if (front == nullptr) {
                cout << "Queue is empty" << endl;
                return;
            }
            Node* temp = front;
            while (temp != nullptr) {
                cout << temp->data << " ";
                temp = temp->next;
            }
            cout << endl;
        }
};

int main() {
    Queue q;
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.display();
    cout << "Front element: " << q.peek() << endl;
    q.dequeue();
    q.display();
    cout << "Front element: " << q.peek() << endl;
    q.dequeue();
    q.display();
    cout << "Front element: " << q.peek() << endl;
    return 0;
}
