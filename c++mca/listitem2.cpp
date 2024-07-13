#include<iostream>
#include <string>
#include <iomanip>
using namespace std ;
int main(){
	
	string item_Name1, item_Name2;
	float  item_Code1, item_Code2;
	float  item_Cost1, item_Cost2;
	
	
		cout<<"Enter first Iteam Name ";
		cin.ignore();
		getline(cin, item_Name1);
		cout<<"Enter first Iteam Code ";
		cin>>item_Code1;
		cout<<"Enter first Iteam Cost ";
		cin>>item_Cost1;
	
	
		cout<<"Enter secound Iteam Name ";
		cin.ignore();
		getline(cin, item_Name2);
		cout<<"Enter secound Iteam Code ";
		cin>>item_Code2;
		cout<<"Enter secound Iteam Cost ";
		cin>>item_Cost2;
		
		
	    cout <<  "Item Name" << setw(15) <<"Item Code"<< setw(10)   <<"Item Cost" << endl;
		cout <<   item_Name1 << setw(15) << item_Code1 << setw(10)   << item_Cost1 << endl;
		cout <<   item_Name2 << setw(6) << item_Code2 << setw(10)   << item_Cost2 << endl;

	return 0 ;
}