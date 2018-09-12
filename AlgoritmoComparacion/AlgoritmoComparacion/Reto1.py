def numFibonacci(n):
    if n == 1:
        return 1
    elif n == 0:
        return 0
    else:
        return numFibonacci(n-1)+numFibonacci(n-2)

def lastFibonacci(n):
    if n == 1:
        return 1
    elif n == 0:
        return 0
    else:
        return (lastFibonacci(n-1)+lastFibonacci(n-2))%10

print(numFibonacci(38))

print(lastFibonacci(38))