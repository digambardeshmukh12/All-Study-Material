#include<iostream>
using namespace std ;

int main(){
	int n ;
	
	cout<<"Enter how many students in class ";
	cin>>n ;
	int arr[n];
	
	for(int i = 0 ; i<n;i++){
		
		cout<<"Enter marks of dsa for student "<<i+1<<" " ;
		cin>>arr[i];
	}
	int k = 0 ;
	int less = arr[0]  ;
	int high  = arr[0] ;
	
	for(int i = 0 ; i <n ; i++){
		cout<<arr[i]<<" ";
		k = k+ arr[i];
		
		if(less>arr[i]){
			less = arr[i];
		}
		if(high<arr[i]){
			high = arr[i];
		}
		
	}
	cout<<"\nAverage of class "<<k/n<<endl;
	cout<<"Less "<<less<<endl;
	cout<<"High "<<high<<endl;
	
	
	return 0 ;
}