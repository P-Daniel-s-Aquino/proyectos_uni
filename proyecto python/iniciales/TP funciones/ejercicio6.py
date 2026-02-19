# Números naturales
# Desarrollar una función que muestre por pantalla los primeros n 
# números naturales considerando al 0 (cero) como primer número natural, 
# siendo n un valor que se pasa por parámetro

num: int = int(input("Ingresar un numero natural: "))

def nums_natural(num: int) -> None:
    for n in range(num):
        if n == num - 1:
            print(n, end=".")
        else:
            print(n, end=", ")

nums_natural(num)
