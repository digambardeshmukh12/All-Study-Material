#include<iostream>
using namespace std ;

int main(){
	int noOfStudent;
	
	
	cout<<"Enter No Of Students in class ";
	cin>>noOfStudent;

	int DSAmarks[noOfStudent];
	
	for(int a = 0 ; a<noOfStudent;a++){
		cout<<"Roll no "<<a + 1 <<" Enter DSA Marks " ;
		cin>>DSAmarks[a];
		
	}
	
	int average = 0;
	for(int a = 0 ; a<noOfStudent;a++){
		average = average + DSAmarks[a];
	}
	cout<<"Average marks in class "<<average/noOfStudent<<endl;
	
	
	
		int High , Low;
	High=Low=DSAmarks[0];
	
	for(int a = 1 ; a<noOfStudent;a++){
		
		if(DSAmarks[a]>High){
			High = DSAmarks[a];
		}
		else{
			Low = DSAmarks[a];
		}
		
	
	}
			
	
	
		cout<<"Highest marks = "<<High<<endl;
		cout<<"Lowest marks  = "<<Low <<endl;
	
	
	
	return 0 ;
}