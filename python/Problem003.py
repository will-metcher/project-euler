#6857.0 in 0.0020148754119873047
import time

start = time.time()

num = 600851475143  
i = 2

while i * i < num:
    while num % i == 0:
        num /= i
    i += 1

end = time.time()
print(num, "in", end-start)
