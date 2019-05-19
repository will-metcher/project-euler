largest = 0

def isPalindromic(string):
    if string == string[::-1]:
        return True
    else:
        return False

for x in range(100,1000):
    for y in range(100,1000):
        if isPalindromic(str(x*y)):
            if x*y > largest:
                largest = x*y

print(largest)
        
