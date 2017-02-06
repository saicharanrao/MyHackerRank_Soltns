#include <stdio.h>
 //Program to find duplicates
void dupes(int a[], int n)
{
    int swaps = 0;
    int i;
 
    for (i = 0; i < n; i++)
        while (a[a[i]] != a[i]) {
            int tmp = a[i];
            a[i] = a[tmp];
            a[tmp] = tmp;
            swaps++;
        }
 
    for (i = 0; i < n; i++)
        if (a[i] != i)
            printf("%d ", a[i]);
 
    printf("\n(swaps = %d)\n", swaps);
}
 
int main()
{
    int x[] = {1, 2, 3, 1, 3, 0, 6};
 
    dupes(x, sizeof x / sizeof x[0]);
 
    return 0;
}
 