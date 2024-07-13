#include <stdio.h>
#include<conio.h>

void checkgreat(int *a , int *b){
    
    if(*a>*b)
    printf("the greter value is %d ",*a);
    else
    printf("the greter value is %d ", *b);
}

int main()
{
    int p,q;
    
    printf("enter the values\n");
    scanf("%d%d",&p,&q);
    checkgreat(&p,&q);
    
    
}
