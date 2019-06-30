def anagrams(word, words):
    return list(a for a in words if sorted(list(a))==sorted(list(word)))
