#include <stdio.h>
int main() {
   int n;
  scanf("%d",&n);
  int count=n;
  {
  for(int r=1;r<=n;r++)
  {
  for(int c=count;c>=1;c--)
  { printf("%d",c);
  }
count--;
  
  printf("\n");
  }
  }

 // Type your code here
	return 0;
}