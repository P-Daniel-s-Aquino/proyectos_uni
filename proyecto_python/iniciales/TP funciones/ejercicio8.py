# Invertir cadena
# Escribir una función que reciba un string y lo devuelva invertido. 
# Por ejemplo: invertirCadena("Hola"),retorna "aloH". Reutilice la 
# función implementada para decir si una palabra es o no, 
# un palíndromo. esPalindromo("neuquen") devuelve true

cadena : str = input('Ingrese una cadena: ')

def invertir(cadena: str) -> str:
    invertido : str = ''
    tamanio : int = len(cadena) - 1
    
    while tamanio >= 0:
        invertido += cadena[tamanio]
        tamanio -= 1
        
    return invertido

print(invertir(cadena))
