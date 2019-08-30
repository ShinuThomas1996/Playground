#include<stdio.h>
int main()
{
 int size,arr[1000];
  scanf("%d",&size);
  int t=0;
  for(int i=0;i<size;i++)
  {
  scanf("%d",&arr[i]);
  }
  
  for(int j=1;j<size;j++)
  {
  for(int k=1;k<size;k++)
  {
    if (arr[j]<arr[k])
  {
    int t=arr[j];
  arr[j]=arr[k];
  arr[k]=t;
  }
  }
  }

int c=1,temp;
  for(int i=0;i<size;i++)
  {
    if(arr[i]!=i+1)
    {
      c=0;
      temp=i+1;
      break;
    }
  }
  if(c==0)
   printf("%d ",temp);
  return 0;
}