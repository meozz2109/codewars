def row_weights(array):
    return (sum(array[i] for i in range(len(array)) if i%2==0), sum(array[i] for i in range(len(array)) if i%2!=0))