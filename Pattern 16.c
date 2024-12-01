/*
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
*/

#include <stdio.h>   // For input/output functions

int main()
{
    int N, i, j;

    // Prompt the user to enter a number
    printf("Enter any number N = ");
    scanf("%d", &N);

    // Upper half of the pattern (including middle row)
    for (i = N; i >= 1; i--)
    {
        // Print decreasing numbers on the left side
        for (j = N; j > i; j--)
        {
            printf("%d ", j);
        }

        // Print the repeated center numbers
        for (j = 1; j <= (i * 2 - 1); j++)
        {
            printf("%d ", i);
        }

        // Print increasing numbers on the right side
        for (j = i + 1; j <= N; j++)
        {
            printf("%d ", j);
        }

        // Move to the next line
        printf("\n");
    }

    // Lower half of the pattern (excluding middle row)
    for (i = 2; i <= N; i++) // Start from 2 to avoid repeating the middle row
    {
        // Print decreasing numbers on the left side
        for (j = N; j > i; j--)
        {
            printf("%d ", j);
        }

        // Print the repeated center numbers
        for (j = 1; j <= (i * 2 - 1); j++)
        {
            printf("%d ", i);
        }

        // Print increasing numbers on the right side
        for (j = i + 1; j <= N; j++)
        {
            printf("%d ", j);
        }

        // Move to the next line
        printf("\n");
    }

    return 0;
}
