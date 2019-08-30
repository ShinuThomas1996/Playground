#include <stdio.h>
int sum(int num);
void main()
{
 int num;
  scanf("%d",&num);
  printf("%d",sum(num));
  return 0;
}
int sum(int num)
{
if(num==0)
{
return 0;}
else
{
return num+sum(num-1);
}
}