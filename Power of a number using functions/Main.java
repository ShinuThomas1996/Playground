#include<stdio.h>
int power(int n,int c);
int main(){
    int n,c;
  scanf("%d %d",&n,&c);
    printf("%d",power(n,c));
  return 0;
}
int power(int n,int c)
{
  int p=1;
  while(c>=1)
  { p=p*n;
    c--;
}
return p;
}
