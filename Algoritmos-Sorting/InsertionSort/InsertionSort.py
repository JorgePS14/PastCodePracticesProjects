
def insertionSort(array):
    n = len(array)
    temp;

    for i in range (1, n):
        j = i

        while(j>0 & array[j-1] > array[j]):
            x = array[i]
            array[i] = array[i-1]
            array[i-1] = x
            j -= 1
    n -= 1

    return array

array = [5,1,3,2,4,9,8,7,0]

print(bubbleSort(array))



