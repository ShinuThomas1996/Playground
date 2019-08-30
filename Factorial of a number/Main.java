#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int f=1;
  for(int i=1;i<=n;i++)
  {
  f=f*i;
  }
printf("%d",f);
  return 0;
}