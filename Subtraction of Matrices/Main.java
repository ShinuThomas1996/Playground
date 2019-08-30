#include<stdio.h>
void display(int a, int b, int matrix[a][b]);
void sub(int a, int b, int matrix1[a][b], int matrix2[a][b], int subtract[a][b]);

int main()
{
  int a;
  int b;
  scanf("%d",&a);
  scanf("%d",&b);
  int matrix1[a][b];
  for(int i=0;i<a;i++)
  {
   for(int j=0;j<b;j++)
   {
    scanf("%d",&matrix1[i][j]);
   }
  }
  int matrix2[a][b];
  for(int i=0;i<a;i++)
  {
   for(int j=0;j<b;j++)
   {
    scanf("%d",&matrix2[i][j]);
   }
  }
  int subtract[a][b];
  sub(a,b,matrix1,matrix2,subtract);
  display(a,b,subtract);
}

void sub(int a, int b, int matrix1[a][b], int matrix2[a][b], int subtract[a][b])
{
  for(int i = 0; i <=a; i++)
  {
   for(int j = 0; j <=b - 1; j++)
   {
    subtract[i][j] = matrix1[i][j] - matrix2[i][j];
   }
  }
}

void display(int a,int b,int matrix[a][b])
{
  for(int i=0;i<=a-1;i++)
  {
   for(int j=0;j<=b-1;j++)
   {
    printf("%d ",matrix[i][j]);
   }
   printf("\n");
  }
}