def expanded_form(num):
    s = ""+str(num)
    arr = list(s)
    re = ""
    for i in range(0, len(arr)):
        if arr[i] is not "0":
            re+= (arr[i]+"0"*(len(arr)-1-i))+" + "
    return re[:-3]