#104743 in 0.25583624839782715 seconds.
import time
from EulerUtils import *

start = time.time()
#nth prime number
target = 10001

count = 0
for i in range(2,999999):
    if isPrime(i):
        count += 1
        if(count == target):
           end = time.time()
           print(i,"in",end-start,"seconds.")
           break
