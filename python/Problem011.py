import time
 
start = time.time()

largest_product = 0

f = open("../txt/p011_grid.txt",'r')
string = f.read()
f.close()

string.replace(" ","")

grid = [[] for l in range(20)]

for x in range(20):
    for y in range(20):
        grid[x].append(string[x+y])

print(grid)





 
