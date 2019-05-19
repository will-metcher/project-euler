largest = 1000
count = 0

for i in range(largest):
    if i % 3 == 0 or i % 5 == 0:
        count += i

print("Total:",count)
