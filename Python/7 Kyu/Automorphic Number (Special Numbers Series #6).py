def automorphic(n):
    return 'Automorphic' if (str(n)==str(n**2)[(len(str(n**2))-len(str(n))):]) else 'Not!!'