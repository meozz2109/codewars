def nth_smallest(arr, pos):
    for i,j in enumerate(sorted(arr)):
        if i == pos-1:
            return j