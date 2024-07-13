#include <iostream>
#include <string>
#include <iomanip>

using namespace std ;

class item {
	public :
		
	string item_Name;
	float item_Code;
	float item_Cost;
	
	void input(){
		cout<<"Enter Iteam Name ";
		cin.ignore();
		getline(cin, item_Name);
		cout<<"Enter Iteam Code ";
		cin>>item_Code;
		cout<<"Enter Iteam Cost ";
		cin>>item_Cost;
		
	}
	void display(){
		cout << left << setw(25) << item_Name << setw(15) << item_Code << setw(10) << fixed << setprecision(2) << item_Cost << endl;
	}
	
};

int main(){
	
	item obj ,obj2 ;
	 obj.input();
	 obj2.input();
	 cout << left << setw(25) << "Item Name" << setw(15) << "Item Code" << setw(10) << "Cost" << endl;
	 obj.display();
	 obj2.display();
	 
	 

	return 0 ;
}