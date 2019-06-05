#871198282 in 0.012988805770874023
import string
import time

start = time.time()

f = open("../txt/p022_names.txt",'r')
names = f.read()
f.close()
names = names.replace('"',"")
names = names.split(",")
names.sort()
total = 0


for i in range(len(names)):
    temp = 0
    for j in names[i]:
        temp += ord(j.lower()) - 96
    total += temp * (i + 1)

print(total,"in",time.time()-start)

