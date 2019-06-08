numbers = []

for x in range(1, 999):
    for y in range(1, 999):
        identity = str(x)+str(y)+str(x*y)
        nums_used = []
        for i in range(0,len(identity)):
            if identity[i] not in nums_used:
                nums_used.append(i)
            else:
                break
        if len(nums_used) == 9:
            numbers.append(identity)

print(numbers)
            
