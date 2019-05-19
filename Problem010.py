#142913828922 in 10.995213747024536 seconds.
import time, math
start = time.time()

def is_prime(n):
    if n % 2 == 0 and n > 2:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

total = 0
ceiling = 2000000

for i in range(3,ceiling):
    if is_prime(i):
        total += i


end = time.time()
print(total,"in",end-start,"seconds.")
