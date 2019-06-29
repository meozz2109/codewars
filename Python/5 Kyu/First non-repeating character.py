def first_non_repeating_letter(string):
    s = string.lower()
    for i in range(0, len(string)):
        if s.count(s[i])==1 and string[i]==s[i]:
            return s[i]
        elif string[i]!=s[i] and s.count(s[i])==1: return string[i]
    return ""