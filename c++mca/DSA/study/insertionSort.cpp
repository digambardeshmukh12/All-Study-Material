#include <iostream>

using namespace std;

void insertionSort(int arr[], int n) {
   
    for (int i = 1; i < n; i++) {
        int comp = arr[i];
       
	    int j = i - 1;
        
        while (j >= 0 && arr[j] > comp) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = comp;
    }
}

int main() {
    
    


	int n ;
	cout<<"Enter how many numbers you want to insert in array ";
	cin>>n;
	int arr[n];
	for(int i = 0 ; i<n;i++){
		cout<<"Enter ";
		cin>>arr[i];
	}
	
	
	
    insertionSort(arr, n);

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
