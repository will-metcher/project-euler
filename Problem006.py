#25164150 in 0.0 seconds.
import time

start = time.time()

sum_of_squares = 0
square_of_sums = 0

max_num = 100

count = 0
for i in range(max_num+1):
    count += i
    sum_of_squares += i ** 2
square_of_sums = count ** 2

total = square_of_sums - sum_of_squares
end = time.time()
print(total,"in",end-start,"seconds.")

