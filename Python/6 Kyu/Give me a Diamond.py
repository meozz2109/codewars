def diamond(n):
    re = ""
    count = b = 0
    s = n-2
    a = int(n/2)
    for i in range(n+1):
        if a!=0 and count%2==0:
            re += ' '*a
            a-=1
        if i % 2 != 0: re+='*'*i+'\n'
        count+=1
    while s>0:
        b+=1
        re+=' '*b+'*'*s+'\n'
        s-=2
    return re[:-1] if n%2!=0 and n>=0 else None
