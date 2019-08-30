#include <stdio.h>
#include <string.h>
#include<stdlib.h>
int main()
{
  char text[100],n[10],rn[10],str[10][10];
  int i=0,j=0,k=0,a,b;
  gets(text);
  scanf("%s",n);
  scanf("%s",rn);
  b=strlen(text);
  for (k=0;k<b;k++)
  {
  if (text[k]!=' ')
  {
  str[i][j]=text[k];
  j++;
  }
  else
  {
  str[i][j]='\0';
  j=0; i++;
  }
  }
  str[i][j]='\0';
  a=i;
  for (i=0;i<=a;i++)
  {
  if(strcmp(str[i],n)==0)
  strcpy(str[i],rn);
  printf("%s ",str[i]);
  }
  return 0;
}