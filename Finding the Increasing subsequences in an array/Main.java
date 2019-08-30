#include<stdio.h>
int array(int arr_size, int arr[], int sum_arr[]);
int main()
{
    int n;
	scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);   
    }
    int sum_arr[3 * n];
    array(n,arr,sum_arr);
    return 0;
}    
int array(int n,int arr[],int sum_arr[])
{
	for(int j=0;j<=n-1;j++)
        {
            int key=arr[j];
            for(int k=j+1;k<=n-1;k++)
            {       
                    if(arr[k]>key)
                    printf("%d,%d\n",key,arr[k]);
            }
        }
    return 0;
}