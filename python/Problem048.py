#9110846700 in 0.026986122131347656
import time

start = time.time()
total = 0

for i in range(1,1000):
    total += i**i

print(str(total)[-10:],"in",time.time()-start)
