#include <stdio.h> 

// Function to sort an array of floating-point numbers in ascending order using Insertion Sort 

void insertionSort(float arr[], int n) { 

    for (int i = 1; i < n; i++) { 

        float key = arr[i]; 

        int j = i - 1; 

        while (j >= 0 && arr[j] > key) { 

            arr[j + 1] = arr[j]; 

            j = j - 1; 

        } 

        arr[j + 1] = key; 

    } 

} 

int main() { 

    int n; 

    printf("Enter the number of students: "); 

    scanf("%d", &n); 

    float percentage[n]; 

    for (int i = 0; i < n; i++) { 

        printf("Enter the percentage of student %d: ", i+1); 

        scanf("%f", &percentage[i]); 

    } 

    insertionSort(percentage, n); 

    printf("\nArray of percentages in ascending order: "); 

    for (int i = 0; i < n; i++) { 

        printf("%0.2f ", percentage[i]); 

    } 

    printf("\n"); 

    return 0; 

} 