#443839 in 5.717859268188477
import time

start = time.time()

total = 0
power = 5

def sum_of_digit_powers(n):
    total = 0
    for i in range(len(str(n))):
        total += int(str(n)[i]) ** power
    return total
        

for i in range(2, 999999):
    if i == sum_of_digit_powers(i):
        total += i

print(total,"in",time.time()-start)
    


