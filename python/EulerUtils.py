import math

def is_palindromic(string):
    if string == string[::-1]:
        return True
    else:
        return False


def is_prime(n):
    if n % 2 == 0 and n > 2:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

def get_factors(n, i = 1):
    factors = []
    while(i*i <= n):
        if n % i == 0:
            factors.append(i)
        i += 1
    return factors * 2

def calc_factorial(n, total=1):
    for i in range(1,n+1):
        total *= i
    return total
