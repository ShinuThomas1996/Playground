#include<stdio.h>
int square(int num);
int main() {
   int n;
   scanf("%d", &n);
   printf("%d", square(n));
   return 0;
}
int square(int num)
{
    int result = num * num;
    return result;
}