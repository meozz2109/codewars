def max_gap(numbers):
    return max(a-b for a,b in zip(sorted(numbers)[1:], sorted(numbers)))