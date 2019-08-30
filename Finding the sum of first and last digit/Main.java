#include <stdio.h>
int main() {
	  int n, temp,fd, ld, sum;
    scanf("%d", &n);
    temp = n;
    ld = n % 10;
    while (n>= 10)
    {
        n /= 10;
    }
    fd = n;
    sum = fd + ld;
    printf("%d", sum);
	return 0;
}