#include <stdio.h>
int main(void)
{
    for (int i = 1; i <= 50; i++)
    {
        !(i % 15) ? printf("FizzBuzz\n") : !(i % 3) ? printf("Fizz\n") : !(i % 5) ? printf("Buzz\n") : printf("%d\n", i);
    }
    return 0;
}