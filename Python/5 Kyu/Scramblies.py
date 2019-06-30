from collections import Counter
def scramble(s1, s2):
    return len(Counter(s2)-Counter(s1))==0