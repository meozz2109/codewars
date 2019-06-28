def goodVsEvil(good, evil):
    d1 = {1:1, 2: 2, 3: 3, 4: 3, 5: 4, 6: 10}
    d2 = {1:1, 2: 2, 3: 2, 4: 2, 5: 3, 6: 5, 7: 10}
    arr = [int(s) for s in good.split() if s.isdigit()]
    arr1 = [int(s) for s in evil.split() if s.isdigit()]
    sum0 = sum1 = 0
    for i in range(0,len(arr)):
        sum0+=int(arr[i])*d1.get(i+1,0)
    for i in range(0,len(arr1)):
        sum1+=int(arr1[i])*d2.get(i+1,0)
    re = ""
    if sum0 > sum1:
        re = "Battle Result: Good triumphs over Evil"
    elif sum0 == sum1:
        re = "Battle Result: No victor on this battle field"
    elif sum0 < sum1:
        re = "Battle Result: Evil eradicates all trace of Good"
    return re