number = 100

def calc_factorial(n):
    total = 1
    for i in range(1,n+1):
        total *= i
    return total

def add_digits(n):
    total = 0
    num = str(n)
    for i in num:
        total += int(i)
    return total

print(add_digits(calc_factorial(number)))
