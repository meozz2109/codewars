import re
def alphanumeric(string):
    return bool(re.search("^(?=.*[a-zA-Z\d])[^\s_]+$", string))