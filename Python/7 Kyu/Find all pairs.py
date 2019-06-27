import numpy
def duplicates(arr):
    num = 0
    arr1 = numpy.zeros(1001)
    for i in arr:
        num1 = arr1[i]
        num += num1%2
        arr1[i]+=1
    return num
