import math

def isPalindromic(string):
    if string == string[::-1]:
        return True
    else:
        return False


def isPrime(n):
    if n % 2 == 0 and n > 2:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

def getFactors(n):
    factors = []
    for i in range(1,n+1):
        if n % i == 0:
            factors.append(i)
    return factors

def calcFactorial(n, total=1):
    for i in range(1,n+1):
        total *= i
    return total
