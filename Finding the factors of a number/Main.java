#include <stdio.h>
int main() 
{
	int n;
  scanf("%d",&n);
  for(int f=1;f<=n;f++)
  {
  if(n%f==0)
    {
    printf("%d\n",f);
    }
   
  }
	return 0;
}