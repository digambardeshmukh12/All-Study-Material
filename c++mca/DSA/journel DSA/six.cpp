#include <stdio.h> 

#define MAX_SIZE 100 

int front = -1, rear = -1; 

int queue[MAX_SIZE]; 

int is_empty() { 

    return front == -1 && rear == -1; 

} 

int is_full() { 

    return (rear + 1) % MAX_SIZE == front; 

} 

void enqueue(int order) { 

    if (is_full()) { 

        printf("Queue is full. Order cannot be placed.\n"); 

    } else if (is_empty()) { 

        front = 0; 

        rear = 0; 

        queue[rear] = order; 

        printf("Order %d placed successfully.\n", order); 

    } else { 

        rear = (rear + 1) % MAX_SIZE; 

        queue[rear] = order; 

        printf("Order %d placed successfully.\n", order); 

    } 

} 

void dequeue() { 

    if (is_empty()) { 

        printf("Queue is empty. No orders to serve.\n"); 

    } else if (front == rear) { 

        printf("Order %d served successfully.\n", queue[front]); 

        front = -1; 

        rear = -1; 

    } else { 

        printf("Order %d served successfully.\n", queue[front]); 

        front = (front + 1) % MAX_SIZE; 

    } 

} 

void display() { 

    if (is_empty()) { 

        printf("Queue is empty. No orders to display.\n"); 

    } else { 

        printf("Orders in the queue are: "); 

        for (int i = front; i != rear; i = (i + 1) % MAX_SIZE) { 

            printf("%d ", queue[i]); 

        } 

        printf("%d\n", queue[rear]); 

    } 

} 

int main() { 

    int choice, order; 

    while (1) { 

        printf("Enter your choice:\n"); 

        printf("1. Place order\n"); 

        printf("2. Serve order\n"); 

        printf("3. Display orders\n"); 

        printf("4. Exit\n"); 

        scanf("%d", &choice);        switch (choice) { 

            case 1: 

                printf("Enter the order number: "); 

                scanf("%d", &order); 

                enqueue(order); 

                break; 

            case 2: 

                dequeue(); 

                break; 

            case 3: 

                display(); 

                break; 

            case 4: 

                printf("Exiting...\n"); 

                return 0; 

            default: 

                printf("Invalid choice. Please try again.\n"); 

        } 

    } 

} 

 

 