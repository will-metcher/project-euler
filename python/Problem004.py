from EulerUtils import *

largest = 0

for x in range(100,1000):
    for y in range(100,1000):
        if isPalindromic(str(x*y)):
            if x*y > largest:
                largest = x*y

print(largest)
        
