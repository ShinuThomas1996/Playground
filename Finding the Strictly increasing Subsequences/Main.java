#include<stdio.h>
int array(int n,int arr[],int sum[]);
int main()
{
    int n;
	scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
    scanf("%d",&arr[i]);   
    }
    int sum[3*n];
    array(n,arr,sum);
    return 0;
}    
int array(int n,int arr[],int sum[])
{
	for(int j=0;j<=n-1;j++)
 {
 int key= arr[j];
 int f=1;
 for(int k=j+1;k<=n-1;k++)
 {
 if(arr[k]>key)
 {
 for(int l=j;l<=k;l++)
 {
 if(arr[l]>arr[k])
 f=0;
 }
 if(f==1)
 printf("%d,%d\n",key,arr[k]);          }
f=1;
}
}
return 0;
}
