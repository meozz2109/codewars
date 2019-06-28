def valid_parentheses(string):
    a = list(string)
    a1 = []
    a2 = []
    for i in range(0, len(a)):
        if a[i] == "(":
            a1.append(i)
        elif a[i] == ")":
            a2.append(i)
    return all(i < j for (i, j) in zip(a1, a2)) and string.count("(") == string.count(")")