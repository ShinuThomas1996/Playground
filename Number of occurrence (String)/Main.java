#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100
int count1(char * str, char * toSearch);
void string1(char s[]) {
   int c = 0;
 
   while (s[c] != '\0') {
      if (s[c] >= 'a' && s[c] <= 'z') {
         s[c] = s[c] - 32;
      }
      c++;
   }
}
int main()
{
    char str[MAX_SIZE];
    char toSearch[MAX_SIZE];
    int count;
    scanf("%[^\n]s",str);
    string1(str);
    scanf("%s",toSearch);
    string1(toSearch);
    count = count1(str, toSearch);
    printf("%d", count);
    return 0;
}
int count1(char * str, char * toSearch)
{
    int i, j, found, count;
    int stringLen, searchLen;
    stringLen = strlen(str);      
    searchLen = strlen(toSearch); 
    count = 0;
    for(i=0; i <= stringLen-searchLen; i++)
    {
        found = 1;
        for(j=0; j<searchLen; j++)
        {
            if(str[i + j] != toSearch[j])
            {
                found = 0;
                break;
            }
        }
        if(found == 1)
        {
            count++;
        }
    }
    return count;
}