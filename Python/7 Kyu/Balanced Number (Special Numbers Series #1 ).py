def balanced_num(num):
    return 'Balanced' if sum(int(x) for i,x in enumerate(str(num)) if i<len(list(str(num)))/2-1) == sum(int(x) for i,x in enumerate(str(num)) if i>len(list(str(num)))/2) else 'Not Balanced'

