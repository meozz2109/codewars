def add_binary(a,b):
    c=(int)(a+b)
    d=''
    word=''
    if c==0: return "0"
    for i in range(0,100000):
        if c%2==0:
            d += '0'
        else:
            d += '1'
        c = c//2
    list=len(d)-1
    while list>=0:
        word += d[list]
        list -= 1
    return '%d' % int(word)