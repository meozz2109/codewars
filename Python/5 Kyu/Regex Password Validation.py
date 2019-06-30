from re import search
def main():
    regex = "[\d]+[a-z]+[A-Z]+[0-9A-Za-z]{3,}"
    print(bool(search(regex, 'fjd3IR9')))
if __name__ == '__main__':
    main()
