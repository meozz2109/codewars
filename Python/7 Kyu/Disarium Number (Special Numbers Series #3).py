def disarium_number(number):
    return 'Disarium !!' if (number == sum(int(a)**(b+1) for b,a in enumerate(str(number)))) else 'Not !!'