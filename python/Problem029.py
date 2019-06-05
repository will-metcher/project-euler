#9183 in 0.00900411605834961
import time

start = time.time()

terms = []
maximum = 100

for a in range(2,maximum+1):
    for b in range(2,maximum+1):
        terms.append(a**b)

print(len(list(set(terms))),"in",time.time()-start)
        
