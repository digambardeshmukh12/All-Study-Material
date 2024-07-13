#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
 int bal;

 
int wid (int a, int b)
{
  
 
int c = a - b;
  
return c;

 
}


 
int dep (int a, int b)
{
  
 
int c = a + b;
  
return c;

}


 
 
 
 
 
void main ()
{
  
 
int atm_dig, pin, option;
  
 
 
printf ("Enter Last four digits of your ATM and pin ");
  
scanf ("\n%d", &atm_dig);
  
scanf ("\n%d", &pin);
  
 
 
if (atm_dig == 6112 && pin == 9922 ){
      
    bal = 10000;
    printf("\nWelcome Raj ");
    
                    }
  
 
  else if (atm_dig == 6113 && pin == 9923){
      
 
            bal = 20000;
             printf("\nWelcome Chitra ");
    
                                        }
  
 
  else if (atm_dig == 6114 && pin == 9924) {
      
 
            bal = 30000;
             printf("\nWelcome karn  ");
    
                                        }
  
 
  else if (atm_dig == 6115 && pin == 9925)
    {
      
 
            bal = 40000;
             printf("\nWelcome Samiksha ");
    
            }
  
 
 else if (atm_dig == 6116 && pin == 9926)
    {
      
 
        bal = 50000;
    
    }
  
 
  else
         {
      
printf ("\nUser not find");
exit(0);

            }
      
 
 
printf("\nEnter NO. for following action \n\t 1)Withdrawal  \n\t 2)Deposit  \n\t 3)Check Balance \n\t 4)Exit ");
scanf ("\n%d", &option);
      
 
 
int wd;
      
int dp;
      
 
switch (option) {
	
 
case 1:
	  
 
 
printf ("\nEnter withdrawal amount");
	  
scanf ("\n%d", &wd);
	  
if (bal < wd && wd > 0)
	    {
	      
 
printf ("\nInsufficient balance ");
	    
 
}
	  
else{
	      
printf ("\nwithdrawal successful ");
	      
printf ("\nYour available balance is %d ", wid (bal, wd));
	      
printf ("\nThanks you for use our ATM ");
	    
 
    }

break;
	
 
case 2:
	  
 
 
printf ("\nEnter the amount to be deposited");
	  
scanf ("\n%d", &dp);
	  
 
if (dp > 0) {
	      
printf ("\nAmount deposited successful ");
	      
printf ("\nMain balance is %d ", dep (bal, dp));
	      
printf ("\nThanks you for use our ATM ");
	    
 
            }
	  
 
else{
	      
printf ("\nInvalid Amount ");
	    
}

break;	
 
 
case 3:
	  
 
printf ("\nYour main balance is %d ", bal);
	  
printf ("\nThanks you for use our ATM ");

break;
 
 
 
case 4:
	  
 
printf ("\nThanks you for use our ATM ");
break;
 

    
    
    
                        }
    
 
 
 
 
}
