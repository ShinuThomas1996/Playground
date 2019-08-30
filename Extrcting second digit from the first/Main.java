#include <stdio.h>
int main() {
	int n,s;
  scanf("%d",&n);
  while(n>=100)
  {
  n/=10;
  }
s=n%10;
  printf("%d",s);
  return 0;
}