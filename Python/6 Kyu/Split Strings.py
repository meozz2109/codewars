def solution(s):
    l=[]
    i=0
    while i+1<len(list(s)):
        l.append(s[i]+s[i+1])
        i+=2
    if len(list(s))%2!=0:
        l.append(s[-1]+'_')
    return l 
