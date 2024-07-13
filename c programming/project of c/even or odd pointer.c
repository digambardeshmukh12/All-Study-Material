#include<stdio.h>
#include<conio.h>

void check(int *a){
    if(*a%2==0){
    printf("this is even number");
    
    }
    else
    printf("this is odd number ");

   
        
    }


void main(){
    int q ;
    
    printf("enter value for q \n");
    scanf("%d",&q);
    check(&q);
   
   
    
    
}