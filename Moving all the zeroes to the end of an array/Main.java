#include <stdio.h>
int main() 
{
int i, count=0;
int size;
scanf("%d",&size);
int arr[20];
for(int j=0;j<=size-1;j++)
{
scanf("%d",&arr[j]);
}
for(i=0;i<size;i++)
{
if(arr[i]>0)
{
arr[count++]=arr[i];
}       
   } 
   while(count<size)
   {
   arr[count++]=0;
   } 
   for(i =0;i<size;i++)
   {
   printf("%d ",arr[i]);
   } 
   return 0;
}
