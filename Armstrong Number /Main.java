#include <stdio.h>
int main() 
{
  int n,t,r;
  int sum= 0;
  int num= 0;
    scanf("%d",&n);  
    t=n; 
    while (t!=0) 
    { 
        num++; 
        t=t/10; 
    } 
    t=n; 
 
    while (t!=0) 
    { 
        r=t%10; 
        sum=sum+pow(r,num); 
        t=t/10; 
    }  
    if (n==sum) 
        printf("Armstrong Number"); 
    else 
        printf("Not an Armstrong Number");  
	return 0;
}

