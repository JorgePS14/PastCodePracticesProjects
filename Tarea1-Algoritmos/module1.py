def sumPrev(n):
    if(n-1 == 0):
        return n
    else:
        return n+sumPrev(n-1)

def sumDig(n):
    if(n < 10):
        return n
    else:
        return n%10+sumDig((n-n%10)/10)

def revWord(s):
    if s == "":
        return s
    else:
        return s[-1]+revWord(s[:-1])

print(sumPrev(100))

print(sumDig(7281979))

print(revWord('Jorge Pietra Santa'))
