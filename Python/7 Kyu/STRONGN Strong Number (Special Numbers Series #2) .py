def strong_num(number):
    return 'STRONG!!!!' if (sum(factor(int(a)) for a in str(number))==number) else 'Not Strong !!'
def factor(num):
    if num==0: return 1
    return num*factor(num-1)