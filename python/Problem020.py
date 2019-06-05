#648 in 0.0010004043579101562
import time
from EulerUtils import *

start = time.time()

number = 100

def add_digits(n, total=0):
    num = str(n)
    for i in num:
        total += int(i)
    return total

print(add_digits(calc_factorial(number)),"in",time.time()-start)
