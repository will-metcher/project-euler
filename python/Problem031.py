#73682 in 0.0009834766387939453
import time

start = time.time()

coins = [1,2,5,10,20,50,100,200]
goal = 200

combos = [0] * (goal+1)
combos[0] = 1

for i in range(len(coins)):
    for j in range(coins[i], goal+1):
        combos[j] += combos[j - coins[i]]

print(combos[-1],"in",time.time()-start)
