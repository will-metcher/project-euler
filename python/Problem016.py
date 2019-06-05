#1366 in 0.0
import time

start = time.time()
base = 2
exp = 1000

power = str(base**exp)
total = 0

for i in power:
    total += int(i)

print(total,"in",time.time()-start)
