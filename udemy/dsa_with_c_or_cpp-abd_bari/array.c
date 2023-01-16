#include <stdio.h>

int main (void)
{
    int A[5] = {1, 2, 3, 4, 5};

    int i;
    for (i = 0; i < 5; i++)
    {
        printf("%d ", A[i]);
    }

    size_t n = sizeof(A);
    printf("%zu\n", n);

    size_t actual_n = n / sizeof(A[0]);
    printf("%zu\n", actual_n);

    return 0;
}