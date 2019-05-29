#233168 in 0.0019731521606445312
import time

start = time.time()

largest = 1000
count = 0

for i in range(largest):
    if i % 3 == 0 or i % 5 == 0:
        count += i

end = time.time()
print(count, "in", end-start)
