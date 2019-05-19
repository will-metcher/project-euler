import math,time
start = time.time()
i = 1
count = 0

def isPrime(n):
    if n % 2 == 0 and n > 2:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True


def get_factors(n):
    factors = []
    for i in range(1,n+1):
        if n % i == 0:
            factors.append(i)
    return factors

for i in range(99999999):
    count += i
    if isPrime(count) != None:
        factors = get_factors(count)
        if len(factors) > 500:
            end = time.time()
            print(count,"in",end-start,"seconds")
            break
    i += 1
