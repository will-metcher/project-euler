#104743 in 0.25583624839782715 seconds.
import time, math

start = time.time()
#nth prime number
target = 10001

def isPrime(n):
    if n % 2 == 0 and n > 2:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

count = 0
for i in range(2,999999):
    if isPrime(i):
        count += 1
        if(count == target):
           end = time.time()
           print(i,"in",end-start,"seconds.")
           break
