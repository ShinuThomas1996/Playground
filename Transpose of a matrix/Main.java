#include<stdio.h>
int main()
{ int a;
  int b;
  scanf("%d",&a);
  scanf("%d",&b);
  int matrix[a][b];
  for(int i=0;i<a;i++)
  {
   for(int j=0;j<b;j++)
   {
    scanf("%d",&matrix[i][j]);
   }
  }
 int transpose[b][a];
  for(int i=0;i<a;i++)
  {
   for(int j=0;j<b;j++)
   {
    transpose[j][i]=matrix[i][j]; 
   }
  }
 for(int i=0;i<b;i++)
  {
   for(int j=0;j<a;j++)
   {
    printf("%d ",transpose[i][j]);
   }
  // int j;
//if(j=a-1)
   printf("\n");
  }
  return 0;
}