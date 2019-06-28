def dig_pow(n, p):
    a = list(str(n))
    re = 0
    for i in a:
        re += pow(int(i), p)
        p += 1
    if (re // n) * n == re: return re//n
    return -1