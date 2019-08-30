#include<stdio.h>
#include<string.h>
#define MAX_LEN 40
int main()
{
    char str[MAX_LEN];
    scanf("%s",str);
    int len = strlen(str);
    int col, rw;
    scanf("%d", &col);
    rw=(len/col);
    if((len%col)>0)
    {
    rw=rw+1;
    }
    int i,j;
    for(i=0;i<col;i++)
    {
    for(j=0;j<rw;j++)
    {
    int a=i+(j*col);
    if((j% 2) == 0)
     {
     // Do nothing
     }
     else
     {
     int b=(col-1)+(j*col);
     a=b-i;
     }      
     char ch;
     if(a>=len)
     {
     ch = 'X';
     }
     else
     {
     ch =str[a];
     }
     printf("%c", ch);
     }
    }   
    return 0;
}