#include<stdio.h>
	static int frequent(int arr[],int n,int freq[]) 
	{ 
	    int maxcount=0; 
		int count=1; 
		
	    for(int i=0;i<n;i++)
	    {
		    for (int j=i+1;j<n;j++) 
		    { 
	            if(arr[i]==arr[j])
	            count ++;
		    }
		    freq[i]=count;
		   count=1;
	    } 
	    for( int i=0;i<n;i++)
	    {
            if(freq[i]>freq[maxcount])
            maxcount=i;
	    }
	    return arr[maxcount];
	}
    int main()
    {
        int n;
        scanf("%d",&n);
        int arr[10];
        for(int i=0;i<n;i++)
        {
            scanf("%d",&arr[i]);
        }
        int freq[n];
		printf("%d",frequent(arr,n,freq)); 
		return 0;
	}