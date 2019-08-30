#include<stdio.h>
int main()
{
   
 int a,b,c,sum,num;
   scanf("%d",&a);
   sum=a%10;
   num=a/10;
   printf("%d",num+sum);
  return 0;
}