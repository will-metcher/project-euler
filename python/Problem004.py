from EulerUtils import *

largest = 0

for x in range(100,1000):
    for y in range(100,1000):
        if is_palindromic(str(x*y)):
            if x*y > largest:
                largest = x*y

print(largest)
        
