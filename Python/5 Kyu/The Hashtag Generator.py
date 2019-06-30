def generate_hashtag(s):
    re = "#"+s.title().replace(" ", "")
    if s=="" or len(re)>140: return False
    return re