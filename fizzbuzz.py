#!/usr/bin/env python

print('\n'.join(['FizzBuzz'[4 if i % 3 else 0:4 if i %
                            5 else 8] or str(i) for i in range(1, 51)]))

'''
def fizzbuzz(till):
    for i in range(1, till):
        if i % 15 == 0:
            print('FizzBuzz')
        elif i % 3 == 0:
            print('Fizz')
        elif i % 5 == 0:
            print('Buzz')
        else:
            print(i)
fizzbuzz(51)
'''
