#include <stdio.h>
int main() {
	int n;
	scanf("%d", &n);
	for(int i = 1; i <= n; i++){
	    printf("%d", i);
	    if(i % 3 == 0 && i != n){
	        printf(",");
        }
    }
	return 0;
}