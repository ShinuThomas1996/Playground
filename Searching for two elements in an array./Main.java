#include<stdio.h>
int main()
{
        int arrsize;
        scanf("%d",&arrsize);
        int arr[10];
        for(int idx = 0; idx <= arrsize - 1; idx++)
        {
            scanf("%d",&arr[idx]);
        }
        int e1;
        scanf("%d",&e1);
        int e2;
        scanf("%d",&e2);
        int elem_1_idx = -1;
        int elem_2_idx = -1;
        for(int idx = 0; idx <= arrsize - 1; idx++)
        {
            if(e1 == arr[idx])
            {
                elem_1_idx = idx;
            }
            if(e2 == arr[idx])
            {
                elem_2_idx = idx;
            }
        }
        printf("%d\n",elem_1_idx);
        printf("%d\n",elem_2_idx);
    return 0;
}
