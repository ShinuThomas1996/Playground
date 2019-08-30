#include<stdio.h>
int main()
{
  int num, f, t, sum;
  scanf("%d", &num);
  f = num / 100;
  t = num % 10;
  sum = f + t;
  printf("%d", sum);

  return 0;
}