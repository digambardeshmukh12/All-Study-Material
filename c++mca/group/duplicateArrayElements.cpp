#include<iostream>
using namespace std;

int main(){
	
	int  a ;
	int s = 0 ;
	cout<<"ENTER HOW MANY NUMBERS YOU WANT TO ENTER IN ARRAY ";
	cin>>a;
	
	int arr[a];
	
	for (int i = 0 ; i<a;i++)
	{
		cout<<"Enter a Number ";
		cin>>arr[i];
		
	}

	cout<<"your Entered Array is [";
	for(int i = 0 ; i<a ; i++){
		cout<<arr[i]<<",";
	}	
	
	
	cout<<"]\n";
	
	int newArray[a];
	
	for(int i = 0 ; i<a;i++){
			int couty= 0 ;
			
		for(int j = 0 ; j<a;j++){
			
		
			if(arr[i]==newArray[j]){
			
			couty++;
				
			}	
		}
		
		if(couty==0){
		    newArray[s]= arr[i];
		    s++;
		}
		else{
		    newArray[s]=0;
		    s++;
		}
		
	}
	
	for(int i = 0 ; i<a ; i++){
	
	if(newArray[i]==0){
		newArray[i]=newArray[i+1];
		newArray[a-1]=0;
	}
	}	
	
	
	cout<<"New Array ";
	
	for(int i = 0 ; i<a ; i++){\
		if(newArray[i]==0){
			cout<<"  _  ";
		}
		else{
			cout<<newArray[i]<<"  ";
		}
		
	}	
	
	return 0 ;
	
}