def selectionSort(a):

    for i in range(0, len(a)-1):

        currentLow = i

        for j in range(i+1, len(a)):
            if a[j] < a[currentLow]:
                currentLow = j

        if currentLow != i:
            temp = a[i]
            a[i] = a[currentLow]
            a[currentLow] = temp

    return a


print(selectionSort([5,1,8,2,4,9,3,7,6,10]))


