def sort_my_string(S):
    a=b=''
    for i in range(len(S)):
        if i%2==0 or i==0:
            a += S[i]
        else:
            b += S[i]
    return a +' ' + b