#include<iostream>
#include<cstdlib>
using namespace std;
struct node{
public:
int data;
node *lt;
node *rt;




};


node *root;
void pre(class node *n)
{

   cout<<"tree";
if(n)
{
cout<<root->data<<endl;
pre(root->lt);
pre(root->rt);
   
}

}


int main()

{
   
    cout<<"tree";

struct node head ;
struct node H1 ;
struct node H2 ;
struct node H3 ;
struct node H4 ;




head = (struct node*)malloc(sizeof(struct node));
H1   = (struct node*)malloc(sizeof(struct node));
H2   = (struct node*)malloc(sizeof(struct node));
H3   = (struct node*)malloc(sizeof(struct node));
H4   = (struct node*)malloc(sizeof(struct node));



head->data=1;
H1->data=2;
H2->data=3;
H3->data=4;
H4->data=5;


head->lt=&H1;
head->rt=&H2;
H1->lt=&H3;
H1->rt=&H4;




    pre(&head);
   
return 0;
}