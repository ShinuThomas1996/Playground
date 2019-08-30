#include<stdio.h>
#include<string.h>
int main()
{
    char str[100];
    scanf("%[^\n]s",str);
    int key;
    scanf("%d",&key);
  key=key%26;
    for(int i=0;str[i]!='\0';i++)
    {
      char ch=str[i];
      if(ch>='A'&&ch<='Z')
      {ch=ch-key;
       if (ch<'A')
       {ch=ch+'Z'-'A'+1;
       }
       str[i]=ch;
      }
      else if(ch>='a'&&ch<='z')
      {ch=ch-key;
       if(ch<'a')
       {ch=ch+'z'-'a'+1;
       }
     str[i]=ch;
      }
    }
    printf("%s",str);  
  return 0;
}