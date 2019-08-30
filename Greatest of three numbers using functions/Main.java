#include <stdio.h>
int greatest(int n1, int n2);
int main(){
	int n1, n2, n3;
	scanf("%d%d%d", &n1, &n2, &n3);
	int g=greatest(n1, n2);
	printf("%d",greatest(g, n3));
  	return 0;
}
int greatest(int n1,int n2){
    int max = 0;
    if(n1 > n2){
        max = n1; 
    }
    else{
        max = n2;
    }
    return max;
}