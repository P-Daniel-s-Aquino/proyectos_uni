# Invertir cadena
# Escribir una función que reciba un string y lo devuelva invertido. 
# Por ejemplo: invertirCadena("Hola"),retorna "aloH". Reutilice la 
# función implementada para decir si una palabra es o no, 
# un palíndromo. esPalindromo("neuquen") devuelve true

cadena : str = input('Ingrese una cadena: ')
cadena_min : str = cadena.lower()

def invertir(cadena_min : str) -> str:
    invertido : str = ''
    tamanio : int = len(cadena_min) - 1
    
    while tamanio >= 0:
        invertido += cadena_min[tamanio]
        tamanio -= 1
        
    return invertido

print(invertir(cadena_min))

def es_palindromo() -> bool:
    
    cadena_sin_espacios = "".join(cadena_min.split())
    
    invertida = cadena_sin_espacios[::-1]
    
    return cadena_sin_espacios == invertida

if es_palindromo():
    print(f'La frase {cadena} es palindromo.')
else:
    print(f'La frase {cadena} NO es palindromo.')

