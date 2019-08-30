#include<stdio.h>
#include<string.h>
int main(){
    char str[100],word[26];
    scanf("%[^\n]s", str);
    int n=0;
    for(int i=0;str[i] != '\0'; i++)
    {
     if((str[i] == 't' || 'T') && str[i + 1] == 'h' && str[i + 2] == 'e'){
     i = i + 3;
     }
       else
       {
        word[n]=str[i];
        n++;
        }
    }
    word[n] = '\0';
    printf("%s\n",word);
    return 0;
}