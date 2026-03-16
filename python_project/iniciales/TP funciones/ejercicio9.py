# La cifra del César
# Encriptar un mensaje usando el método de "la cifra del césar", que consiste en correr cada 
# letra -considerando la posición de cada una en el alfabeto- una determinada cantidad de 
# lugares. Ejemplo: si el corrimiento es de 2 lugares, la palabra "HOLA" se transforma en 
# "JQNC". Si el alfabeto termina antes de poder correr la cantidad de lugares necesarios, 
# se vuelve a comenzar desde la letra "a"

mensaje : str = input('Escriba un mensaje: ')
num : int = int(input('Ingrese la cifra de corrimiento: '))

def cifra_de_cesar(mensaje: str, num: int) -> str:
    
    mensaje_cifrado : str = ''
    
    for letra in mensaje.lower():
        
        if letra.isalpha():  # solo letras
            codigo = ord(letra) - ord('a')   # llevar a 0–25
            codigo_cifrado = (codigo + num) % 26
            mensaje_cifrado += chr(codigo_cifrado + ord('a'))
        else:
            mensaje_cifrado += letra  # mantiene espacios y símbolos
    
    return mensaje_cifrado

print(cifra_de_cesar(mensaje, num))

