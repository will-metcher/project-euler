from EulerUtils import *

number = 100

def add_digits(n, total=0):
    num = str(n)
    for i in num:
        total += int(i)
    return total

print(add_digits(calc_factorial(number)))
