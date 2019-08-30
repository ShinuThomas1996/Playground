#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    scanf("%[^\n]s",str);
    char ch;
    int flag,i,j;
    for(i=0;str[i] != '\0';i++)
    {
    flag=0;
    for(j=0;str[j] != '\0';j++){
    if(str[i]==str[j] && i != j)
    {
    flag=1;
    break;
    }
    }
    if(flag==0)
    {
    ch=str[i];
     break;
    }
    }
    if(flag==0)
    {
    printf("%c", ch);
    }
    else
    {
    printf("All the characters are repetitive");
    }
}