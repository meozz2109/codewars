def sqInRect(lng, wdth):
    re = []
    if lng==wdth: return None
    sq=lng*wdth
    while sq>0:
        re.append(min(lng, wdth))
        if lng > wdth: lng-=wdth
        else: wdth-=lng
        sq=lng*wdth
    return re
