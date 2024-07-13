#include<iostream>
#include<string>
#include <cstring>
#include<conio.h>
#include<cstdlib>
using namespace std ;
struct node{
	struct node* next ;
//	string name;
	int data;
};
int main(){
	int n ;
	string k;
	cout<<"How many Nodes you wants in singly linklist ";
	cin>>n;
	int x ;
	x = n-2;
	string var;
	string dup ;
	struct node* headD;
	struct node* last;
	for(int a = 0 ; a<n;a++){
		cout<<"Enter the variable name and remember name of first Node ";
		cin>>var ;
//		cin.getline(var,13) ;
//		getch();
//		dup=var ;
//		strcpy(dup,var);
		
		
		
		struct node* var;
		struct node* dup;
		var = (struct node*)malloc(sizeof(struct node));
		dup = (struct node*)malloc(sizeof(struct node));
		cout<<"Enter data for node ";
		cin>>var->data;
//		cout<<"Enter name for node " ;
//		cin>>var->name;
		if(a>=0 ){
			if(a==0){
				headD = var;
				headD->data=var->data;
//			k =	headD->name;
			
			}
			
		else if(a>=1){
				dup->next=var;
				dup->next->data=var->data;
				var->next=NULL;
				
				
			 }
			
			dup=var;
			dup->data=var->data;
			
			if(a==x){
				var->next=NULL;
				last = var ;
				
			}
		}
	}
	
	
	struct node* temp;
	temp = (struct node*)malloc(sizeof(struct node));
	temp = headD;
	while(temp->next!=NULL){
		cout<<temp->data<<"->";
		temp=temp->next;
	}

//	struct node* temp;
//	temp = (struct node*)malloc(sizeof(struct node));
//	headD->name = temp->name;
//	temp = headD;
//	while(temp->name!=last->name){
//		cout<<temp->data<<"->";
//		temp->name = temp->next->name;
//		temp = temp->next;
//	}
//	
	
	
	
	return 0 ;
	
}