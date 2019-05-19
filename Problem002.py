maximum = 4000000
term1 = 1
term2 = 2
total = 0

while term1 < maximum or term2 < maximum:
    if term1 % 2 == 0:
        total += term1
    if term2 % 2 == 0:
        total += term2
    term1 += term2
    term2 += term1
    
print("Total:",total)
