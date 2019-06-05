#906609 in 0.5187804698944092
import time
from EulerUtils import *

start = time.time()

largest = 0

for x in range(100,1000):
    for y in range(100,1000):
        if is_palindromic(str(x*y)):
            if x*y > largest:
                largest = x*y

print(largest, "in", time.time()-start)
        
