def enough(cap, on, wait):
    if wait-(cap-on)>0: return wait-(cap-on)
    else: return 0