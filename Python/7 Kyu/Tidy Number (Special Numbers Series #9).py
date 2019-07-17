def tidyNumber(n):
    return all(a<=b for a,b in zip(str(n), str(n)[1:]))