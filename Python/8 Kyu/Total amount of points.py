def points(games):
    c = 0
    for i in games:
        if int(i[0])>int(i[-1]): c+=3
        elif int(i[0])==int(i[-1]): c+=1
    return c
