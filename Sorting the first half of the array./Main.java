#include<stdio.h>
int sort(int n,int list[]);
int main()
{
int n;
scanf("%d",&n);
int list[n];
for(int i=0;i< n;i++)
{
scanf("%d",&list[i]);   
}
sort(n,list);
 return 0;
}    
int sort(int n,int list[])
{
	for (int j=1;j<n/2;j++) 
    {
        int key=list[j];
        int k=j-1;
        while((k>=0)&&(list[k]>key)) 
        {
            list[k+1]=list[k];
            k--;
        }
        list[k+1]=key;
    }
    for(int l=0;l<n;l++)
    {
        printf("%d ",list[l]);
    }
    return 0;
}