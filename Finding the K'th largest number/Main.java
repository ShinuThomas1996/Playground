#include<stdio.h>
int main()
{
        int n,i;
        scanf("%d",&n);
        int arr[100];
        for(int i=0;i<=n-1;i++)
        {
            scanf("%d",&arr[i]);
        }
        int k;
        int temp;
        scanf("%d",&k);
       for(int j=0;j<n;j++)
       {
       for(int l=j+1;l<n;l++)
       {if(arr[j]>arr[l])
       {temp=arr[l];
        arr[l]=arr[j];
        arr[j]=temp;
       }
       }
       }
  printf("%d",arr[n-k]);
    return 0;
     }