# Saludo
# Escribir una función que muestre por pantalla el saludo ¡Hola {y el nombre}! cada vez que se la invoque

nom : str = ''
def saludo(nom) -> None:
    print(f'Hola {nom}')

saludo('x')
saludo('y')
saludo('z')