#include <stdio.h>
int main()
{
int n1,n2;
scanf("%d",&n1);
scanf("%d",&n2);
int mat[n1][n2];
int i, j;
for(i=0;i<n1;i++)
{
  for(j=0;j<n2;j++)
       scanf("%d",&mat[i][j]);
}
for (int k=0;k<n2;k++)
{
  for (i=0,j=k;j<n2;i++,j++)
  {       
           printf("%d ",mat[i][j]);
  }
}

}
