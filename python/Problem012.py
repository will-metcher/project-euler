#76576500 in 11.66162109375 seconds
import time

from EulerUtils import *

start = time.time()
count = 0
for i in range(1, 99999999, 1):
    count += i
    if is_prime(count) == False:
        if len(get_factors(count)) > 500:
            end = time.time()
            print(count,"in",end-start,"seconds")
            break
