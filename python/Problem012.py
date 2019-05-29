import time

from EulerUtils import *

start = time.time()
count = 0

for i in range(1, 99999999):
    count += i
    if is_prime(count) != None:
        factors = get_factors(count)
        if len(factors) > 500:
            end = time.time()
            print(count,"in",end-start,"seconds")
            break
    i += 1
