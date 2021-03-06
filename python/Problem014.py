#Start: 837799 Length: 524 in 32.21921443939209
import time

start = time.time()

maximum = 1000000
#start, sequence length
largest_pair = [0,0]

def collatz(start, length=0):
    while start != 1:
        if start % 2 == 0:
            start /= 2
        else:
            start = 3*start + 1
        length += 1
    return length

for i in range(1,maximum):
    c = collatz(i)
    if c > largest_pair[1]:
        largest_pair[0] = i
        largest_pair[1] = c

print("Start:",largest_pair[0],"Length:",largest_pair[1],"in",time.time()-start)




