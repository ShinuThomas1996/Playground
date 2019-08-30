// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include<stdio.h>
void largest(int list[],int size);
int main() {
   int size,list[10],i;
   scanf("%d",&size);
   for(i=0;i<size;i++)
   {
   scanf("%d",&list[i]);
   }
   largest(list,size);
   return 0;  
}
 void largest(int list[],int size)
 {
     int i,large,max;
     large = list[0];
     max=0;
     for(i=1;i<size;i++)
   { 
    if(large<list[i])
   {
    max=i;
    }
    }  
   printf("%d",max);
 }