#31875000 in 0.09293699264526367 seconds.
import time

start = time.time()

def is_triplet(a,b,c):
    return a**2 + b**2 == c**2


for a in range(1,1000):
    for b in range(a, 1000 - a):
        c = 1000 - a - b
        if c < b:
            break
        if is_triplet(a,b,c):
            end = time.time()
            print(a*b*c,"in",end-start,"seconds.")
            break
