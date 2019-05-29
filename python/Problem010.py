#142913828922 in 10.995213747024536 seconds.
import time
from EulerUtils import *

start = time.time()

total = 0
ceiling = 2000000

for i in range(3,ceiling):
    if isPrime(i):
        total += i


end = time.time()
print(total,"in",end-start,"seconds.")
