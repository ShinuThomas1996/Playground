#include<stdio.h>
int main()
{
  int r,c;
scanf("%d",&r);
scanf("%d",&c);
int a[r][c];
  int flag=0;
int i, j;
for(i=0;i<r;i++)
{
  for(j=0;j<c;j++)
  {   scanf("%d",&a[i][j]);
}}
	int b[r][c];

for(i=0;i<r;i++)
{
  for(j=0;j<c;j++)
  {   scanf("%d",&b[i][j]);
}}
  for(i=0;i<r;i++)
  {
  for(j=0;j<c;j++)
  
  {
 if(a[i][j]!=b[i][j])
 {
 flag=1;
 break;
 }
  }
  }
  if(flag==1)
  {
  printf("No");
  }
  else
  { printf("Yes");
  }
	return 0;
}