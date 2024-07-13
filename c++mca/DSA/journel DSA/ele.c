#include <stdio.h> 

// Function to perform Binary Search on a sorted array 

int binarySearch(int arr[], int left, int right, int x) { 

    while (left <= right) { 

        int mid = left + (right - left) / 2; 

  

        // Check if x is present at mid 

        if (arr[mid] == x) { 

            return mid; 

        } 

        // If x is greater, ignore left half 

        if (arr[mid] < x) { 

            left = mid + 1; 

        } 

        // If x is smaller, ignore right half 

        else { 

            right = mid - 1; 

        } 

    } 

    // If we reach here, then the element was not present in the array 

    return -1; 

} 

  

int main() { 

    int n, x; 

    printf("Enter the number of elements in the array: "); 

    scanf("%d", &n); 

    int arr[n]; 

    printf("Enter the elements of the array in sorted order: "); 

    for (int i = 0; i < n; i++) { 

        scanf("%d", &arr[i]); 

    } 

    printf("Enter the element to be searched: "); 

    scanf("%d", &x); 

    int result = binarySearch(arr, 0, n - 1, x); 

    if (result == -1) { 

        printf("Element not found in the array.\n"); 

    } else { 

        printf("Element found at index %d.\n", result); 

    } 

    return 0; 

} 