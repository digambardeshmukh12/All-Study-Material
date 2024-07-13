#include<iostream>
using namespace std ;

int main(){
	int target , n;
	
	cout<<"How many numbers you have to entered in array ";
	cin>>n;
	
	int arr[n];
	
	for(int a=0; a<n;a++)
		cin>>arr[a];
	
	
	for(int i=0;i<n;i++)
		cout<<arr[i]<<" ";
		
    
    cout<<"\nEnter target ";
    cin>>target;
    
    for(int i=0;i<n;i++){
        
        int k = arr[i];
        k = k + arr[i+1];
        if(k==target){
            cout<<"["<<arr[i]<<","<<arr[i+1]<<"]";
            break;
        }
    }
    
    
    
	
	
	
	
	return 0 ;
}