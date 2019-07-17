def array_leaders(numbers):
    numbers.append(0)
    return [numbers[a] for a in range(len(numbers)-1) if numbers[a] > sum(numbers[a+1:]) and a!=len(numbers)-1]