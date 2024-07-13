#include <cstdlib>
#include <iostream>
using namespace std ;

struct node{
int data ;
struct node* next;

};

int main()
{

// this p is a temprery variable 
struct node *p ;
struct node *t ;
struct node *s ;

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
// sev= new node();
cout<<"Enter data for head "<<endl;

head->data=1;
head->next=sec;

sec->data=2;
sec->next=thi;

thi->data=3;
thi->next=fou;

fou->data=4;
fou->next=fiv;

fiv->data=5;
fiv->next=six;

six->data=6;
six->next=sev;

sev->data=7;
sev->next=NULL;


// first travelsing and s is a temprery variable 

s = head ;

while(s!=NULL){
cout<<s->data<<"->";
s=s->next;
}

cout<<"\n";


// Detletion at Begiening


t = head ;
if(t = NULL){
return 0 ;
}
if(head->next!=NULL){
cout<<"Deleted element is "<<head->data;
cout<<"\n";
head = head->next ;
delete t ;
}

// Travalsing after deletion of first Node

t = head ;

while(t!=NULL){
cout<<t->data<<"->";
t=t->next;
}


// Detletion at Ending

t = head;
while(t->next->next!=NULL){
t=t->next ;
p=t->next;

}
cout<<"\nDeleted element is "<<p->data;
t->next = NULL;
cout<<"\n";

// travlsing after deletion at ending

t = head ;

while(t!=NULL){
cout<<t->data<<"->";
t=t->next;
}


// insurtion at bgining


struct node* ne;
ne = (struct node*)malloc(sizeof(struct node));
ne -> data = 1;
cout<<"\nInserted element is "<<ne->data ;
ne->next=head ;
head=ne;

cout<<"\n";
t = head ;

while(t!=NULL){
cout<<t->data<<"->";
t=t->next;
}


// insertion at ending
//newEND is a new node which is connect at the end 
struct node* newEND;
newEND = (struct node*)malloc(sizeof(struct node));
newEND->data = 10 ;
t = head;
while(t->next != NULL){
t = t->next ;

}
t->next = newEND;
newEND->next = NULL;
   cout<<"\nInserted element is "<<newEND->data ;
cout<<"\n";


t = head ;

while(t!=NULL){
cout<<t->data<<"->";
t=t->next;
}


return 0 ;

}