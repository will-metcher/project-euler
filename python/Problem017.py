#21124 in 0.011998653411865234
import time

start = time.time()

numerals = ["one","two","three","four","five","six","seven","eight","nine"]
teens = ["eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"]
tens = ["ten","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"]

total = 0

def calc_length(n, length=0):
    n = str(n)

    #thousands
    if len(n) == 4:
        length += len(numerals[int(n[0])-1])
        length += len("thousand")
        n = n[1:].lstrip("0")

    #hundreds
    if len(n) == 3:
        length += len(numerals[int(n[0])-1])
        length += len("hundred")
        if int(n) % 100 is not 0:
            length += len("and")
        n = n[1:].lstrip("0")

    #tens
    if len(n) == 2:
        if int(n) > 19 or int(n) == 10:
            length += len(tens[int(n[0])-1])
            n = n[1:].lstrip("0")
        else:
            length += len(teens[int(n[1])-1])
            n = "0"

    #ones
    if len(n) == 1 and int(n) != 0:
        length += len(numerals[int(n[0])-1])

    return length


for i in range(1,1001):
    total += calc_length(i)
    
print(total,"in",time.time()-start)
