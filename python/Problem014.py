startingNumber = 1
result = startingNumber
maximum = 1000000

longestChain = -1

while startingNumber < maximum:
    count = 1
    while result != 1:
        if result % 2 == 0:
            result = result / 2
        else:
            result = (3 * result) + 1
        count += 1

    if count > longestChain:
        longestChain = startingNumber

    startingNumber += 1
    result = startingNumber


print("The starting number with longest chain is:",longestChain, count)



