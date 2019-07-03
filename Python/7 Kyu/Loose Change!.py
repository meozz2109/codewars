def change_count(change):
    re = sum([CHANGE[i] for i in change.split()])
    return '$%.2f'%re
