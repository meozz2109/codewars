def greet(language):
    d = {'english': 'Welcome','czech': 'Vitejte','danish': 'Velkomst','dutch': 'Welkom','estonian': 'Tere tulemast','finnish': 'Tervetuloa','flemish': 'Welgekomen','french': 'Bienvenue','german': 'Willkommen','irish': 'Failte','italian': 'Benvenuto','latvian': 'Gaidits','lithuanian': 'Laukiamas','polish': 'Witamy','spanish': 'Bienvenido','swedish': 'Valkommen','welsh': 'Croeso'}
    re = ""
    for i in d.keys():
        if i == language:
          re+=d.get(i, 'english')
    return re