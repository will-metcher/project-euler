import string

f = open("txt/p022_names.txt",'r')
names = f.read()
names = names.replace('"',"")
names = names.split(",")
names.sort()
total = 0

for i in range(len(names)):
    temp = 0
    for j in names[i]:
        temp += ord(j.lower()) - 96
    total += temp * i

print(total+49)

