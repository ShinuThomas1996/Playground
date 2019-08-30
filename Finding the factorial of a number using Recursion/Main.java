#include<stdio.h>
int factorial(int n);
int main()
{
int n;
  int result;
  scanf("%d",&n);
  if(n<0)
  {
    printf("Invalid input\n");
  }
  else
  {
    result=factorial(n);
    printf("%d\n",result);
  }
return 0;
}
int factorial(int n)
{
  if(n==0|| n==1)
  {
    return 1;
  }
  else
  {
    return(n*factorial(n-1));
    }
}

