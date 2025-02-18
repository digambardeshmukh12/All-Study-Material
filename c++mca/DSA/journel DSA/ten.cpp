#include <stdio.h> 

// Function to sort an array using Bubble Sort 

void bubbleSort(int arr[], int n) { 

    for (int i = 0; i < n - 1; i++) { 

        for (int j = 0; j < n - i - 1; j++) { 

            if (arr[j] > arr[j + 1]) { 

                // Swap the elements if they are in the wrong order 

                int temp = arr[j]; 

                arr[j] = arr[j + 1]; 

                arr[j + 1] = temp; 

            } 

        } 

    } 

} 

int main() { 

    int n; 

    printf("Enter the number of elements in the array: "); 

    scanf("%d", &n); 

    int arr[n]; 

    printf("Enter the elements of the array: "); 

    for (int i = 0; i < n; i++) { 

        scanf("%d", &arr[i]); 

    } 

  

    bubbleSort(arr, n); 

    printf("\nArray sorted in ascending order: "); 

    for (int i = 0; i < n; i++) { 

        printf("%d ", arr[i]); 

    } 

    printf("\n"); 

    return 0; 

} 