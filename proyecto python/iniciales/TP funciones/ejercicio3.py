# Factorial
# Escribir una función que reciba un número entero po# sitivo y devuelva su factori# al

num : int = int(input('ingrese un numero entero: '))

def factorial(num) -> int:
    if num == 0 or num == 1:
        return 1
    else:
        return num * factorial(num - 1)

print(f'{factorial(num)}')