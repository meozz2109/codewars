def final_grade(exam, projects):
    re = 0
    if exam > 90 or projects > 10:
        re += 100
    elif exam > 75 and projects >= 5:
        re += 90
    elif exam > 50 and projects >= 2:
        re +=75
    return re