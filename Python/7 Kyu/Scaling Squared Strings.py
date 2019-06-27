def scale(strng, k, n):
    arr = list(strng)
    s = s1 = ""
    for i in arr:
        if i is not "\n":
            i *= k
        s += i
    arr1 = s.split("\n")
    for i in arr1:
        i += "\n"
        i *= n
        s1 += i
    return s1[:-1]