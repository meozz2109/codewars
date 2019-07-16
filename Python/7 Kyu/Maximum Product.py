def adjacent_element_product(array):
    a = []
    for i in range(len(array)-1): a.append(array[i]*array[i+1])
    return max(a)