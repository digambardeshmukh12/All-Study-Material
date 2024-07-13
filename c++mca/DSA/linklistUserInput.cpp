#include<iostream>
#include<cstdlib>

using namespace std ;

struct node {
	int data ;
	struct node* next ;
	
};

int main(){
	
	struct node* temp;

	
struct node* head;
struct node* sec;
struct node* thi;
struct node* fou;
struct node* fiv;
struct node* six;
struct node* sev;

head =  (struct node*)malloc(sizeof(struct node));
sec  =  (struct node*)malloc(sizeof(struct node));
thi  =  (struct node*)malloc(sizeof(struct node));
fou  =  (struct node*)malloc(sizeof(struct node));
fiv  =  (struct node*)malloc(sizeof(struct node));
six  =  (struct node*)malloc(sizeof(struct node));
sev  =  (struct node*)malloc(sizeof(struct node));

	
	
	head->next=sec;
	sec->next=thi;
	thi->next=fou;
	fou->next=fiv;
	fiv->next=six;
	six->next=sev;
	sev->next=NULL;
	
	
	temp=head  ;
	


while(temp!=NULL){
	cout<<"Enter data: ";
	cin>>temp->data ;
	temp = temp->next;
}

	struct node* s;

	s = head ;

	while(s!=NULL){
	cout<<s->data<<"->";
	s=s->next;
	}
	cout<<"\n";

	
	
	
s = head ;
if(s = NULL){
return 0 ;
}
if(head->next!=NULL){
cout<<"Deleted element is "<<head->data;
cout<<"\n";
head = head->next ;
delete s ;
}
	
	
	// Travalsing after deletion of first Node

s = head ;

while(s!=NULL){
cout<<s->data<<"->";
s=s->next;
}
	
	
	// Detletion at Ending
	
	struct node *p ;

s = head;
while(s->next->next!=NULL){
s=s->next ;
p=s->next;

}
cout<<"\nDeleted element is "<<p->data;
s->next = NULL;
cout<<"\n";

// travlsing after deletion at ending

s = head ;

while(s!=NULL){
cout<<s->data<<"->";
s=s->next;
}


// insurtion at begining


struct node* newNode;
newNode = (struct node*)malloc(sizeof(struct node));
cout<<"\nEnter data for new node at begnning ";
cin>>newNode->data;
cout<<"\nInserted element is "<<newNode->data ;
newNode->next=head ;
head=newNode;

cout<<"\n";
s = head ;

while(s!=NULL){
cout<<s->data<<"->";
s=s->next;
}


// insertion at ending
//newEND is a new node which is connect at the end 
struct node* newEND;
newEND = (struct node*)malloc(sizeof(struct node));
cout<<"\nEnter data for new node at ending ";
cin>>newEND->data;
s = head;
while(s->next != NULL){
s = s->next ;

}
s->next = newEND;
newEND->next = NULL;
   cout<<"\nInserted element is "<<newEND->data ;
cout<<"\n";


s = head ;

while(s!=NULL){
cout<<s->data<<"->";
s=s->next;
}


return 0 ;
	
	
	
}