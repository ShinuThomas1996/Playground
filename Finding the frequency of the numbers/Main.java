#include<stdio.h>
int main()
{
  int n,i,j,k,c=0;
  scanf("%d",&n);
  scanf("%d",&k);
        int arr[100];
        for(j=0;j<=n-1;j++)
        {
            scanf("%d",&arr[j]);
        }

  for( i=1;i<=k;i++)
  {
  for(j=0;j<n;j++)
  {
  if(i==arr[j])
  {
  c=c+1;
  }
  }
    printf("%d %d\n",i,c);
    c=0;
  }
  return 0;
}