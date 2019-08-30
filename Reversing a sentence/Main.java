#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 
int main()
{
    char str[100], reverse[100];
    int len, i, index, start, end;
    gets(str);
    len   = strlen(str);
    index = 0;
    start = len - 1;
    end   = len - 1;
    while(start > 0)
    {
        if(str[start] == ' ')
        {
            i = start + 1;
            while(i <= end)
            {
                reverse[index] = str[i];

                i++;
                index++;
            }
            reverse[index++] = ' ';
            end = start - 1;
        }
      start--;
    }
   
    for(i=0; i<=end; i++)
    {
        reverse[index] = str[i];
        index++;
    }
    reverse[index] = '\0'; 
    printf("%s", reverse);
    return 0;
}

