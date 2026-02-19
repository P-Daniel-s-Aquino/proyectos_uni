# Fecuencia de caracteres
# Escribir un programa que reciba una cadena de caracteres y devuelva un diccionario 
# con cada palabra que contiene y su frecuencia. Escribir otra función que reciba el 
# diccionario generado con la función anterior y devuelva una tupla con la palabra más 
# repetida y su frecuencia

cadena: str = '''
pablito clavo un clavito en la cabeza de un calvito , 
que clavito clavo pablito en la cabeza de un clavito ?
'''

def diccionario(cadena: str) -> dict[str, int]:
    
    frecuencias: dict[str, int] = {}
    palabras: list[str] = cadena.split()
    
    for palabra in palabras:
        if palabra in frecuencias:
            frecuencias[palabra] += 1
        else:
            frecuencias[palabra] = 1

    return frecuencias


def palabra_mas_repetida(diccionario: dict[str, int]) -> tuple[str, int]:
    
    palabra_max: str = ''
    freq_max: int = 0

    for palabra, cantidad in diccionario.items():
        if cantidad > freq_max:
            palabra_max = palabra
            freq_max = cantidad
    
    return palabra_max, freq_max


freq = diccionario(cadena)
print(freq)
print(palabra_mas_repetida(freq))
