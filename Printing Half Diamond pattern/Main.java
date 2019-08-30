#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  for(int r=1;r<=n;r++)
  {
  for(int s=1;s<=(n-r);s++)
  {
  printf(" ");
  }
  for(int c=1;c<=2*r-1;c++)
  {
  printf("*");
  }
  printf("\n");
  }
	return 0;
}