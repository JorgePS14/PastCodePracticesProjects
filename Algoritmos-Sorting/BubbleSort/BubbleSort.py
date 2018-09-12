def bubbleSort(array):
    n = len(array)
    swap = False

    while swap == False:
        swap = True
        for i in range (1, n):
            if array[i-1] > array[i]:
                x = array[i]
                array[i] = array[i-1]
                array[i-1] = x
                swap = False
        n++

    return array

array = [5,1,3,2,4,9,8,7,0]

print(bubbleSort(array))



