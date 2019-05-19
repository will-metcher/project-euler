#Answer: 232792560 in 0.06595134735107422 seconds.
import time
start = time.time()

check_list = [11,13,14,16,17,18,19,20]

def evenlyDivisible(num):
    if num % 2520 != 0:
        return False
    for i in range(len(check_list)):
        if num % check_list[i] != 0:
            return False
    return True

if __name__ == '__main__':
    for i in range(2520, 999999999, 2520):
        if evenlyDivisible(i):
            end = time.time()
            print("Answer:",i,"in", end-start,"seconds.")
            break
