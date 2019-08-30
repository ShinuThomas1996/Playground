#include<stdio.h>
int main()
{
int size,i,sum=0,sum1=0;
  scanf("%d",&size);
  int arr[size];
  
  for(i=0;i<size;i++)
  {
  scanf("%d",&arr[i]);
  }
  for(i=0;i<size;i++)
  {
  if(arr[i]<arr[i+1])
  {sum=sum+arr[i];
  }
  else
  {sum1=arr[i];
  }
  if(sum1>sum)
  {
  sum1=sum;
  sum=0;
  }
  }
  printf("%d",sum);
  return 0;
}