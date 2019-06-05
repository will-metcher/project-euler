#4782 in 0.059966325759887695
import time

start = time.time()

t1 = 1
t2 = 1

count = 2

while len(str(t1)) < 1000:
    t2 += t1
    t1 += t2
    count += 2

print(count, "in", time.time()-start)
