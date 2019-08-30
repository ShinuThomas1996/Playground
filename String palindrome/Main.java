#include <stdio.h>
#include<string.h>
int main()
{
  char str[100];
{
for(int i=0;i<20;i++)
{
scanf("%[^\n]s",&str);
}
int left=0;
int right=strlen(str)-1;
while(left<right)
{
if(str[left++] != str[right--])
{
printf("%s is not a palindrome",str);
  break;
}
  else
  printf("%s is a palindrome",str);
  break;
}}
    return 0; 
}