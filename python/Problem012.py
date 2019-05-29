import math,time
from EulerUtils import *

start = time.time()
i = 1
count = 0

for i in range(99999999):
    count += i
    if isPrime(count) != None:
        factors = getFactors(count)
        if len(factors) > 500:
            end = time.time()
            print(count,"in",end-start,"seconds")
            break
    i += 1
