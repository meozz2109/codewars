def max_multiple(divisor, bound):
    return max(a for a in range(bound+1) if a % divisor == 0)