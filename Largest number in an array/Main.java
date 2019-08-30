#include<stdio.h>
int main()
{int arrsize;
        scanf("%d",&arrsize);
        int arr[10];
        
        for(int i = 0; i <= arrsize - 1; i++)
        {
            scanf("%d",&arr[i]);
        }
        int max;
       
        if(arr[0] > arr[1])
        {
            max = arr[0];
        }
        else{
             max = arr[1];
        }
       
        for(int i = 2; i <= arrsize - 1; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        printf("%d",max);
    return 0;
}