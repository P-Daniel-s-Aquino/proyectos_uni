# Búsqueda secuencial
# Implementar la función: busquedaSecuencial(int [] arreglo, int valorBuscado) que recibe un 
# arreglo de enteros y un valor a buscar, y devuelve la posición del valor buscado, o -1 si 
# el valor no se encuentra

def busqueda_secuencial(arreglo : list, valor_buscado : int) -> int:
   
    if valor_buscado in arreglo:
        indice = arreglo.index(valor_buscado)
        
        return indice
    
    else:
        return -1

print(busqueda_secuencial([1, 2, 3, 4, 5], 2))
print(busqueda_secuencial([1, 2, 2, 3, 4, 5], 3))
print(busqueda_secuencial([1, 2, 2, 3, 4, 5], 10))

# def busqueda_secuencial(arreglo: list, valor_buscado: int):
    # for i in range(len(arreglo)):
        # if arreglo[i] == valor_buscado:
            # return i
    # return -1

# Búsqueda binaria
# Implementar la función: busquedaBinaria(int [] arreglo, int valorBuscado) que recibe un 
# arreglo de enteros y un valor a buscar, y devuelve la posición del valor buscado, o -1 si 
# el valor no se encuentra

def busqueda_binaria(arreglo: list, valor_buscado: int) -> int:
    izquierda = 0
    derecha = len(arreglo) - 1

    while izquierda <= derecha:
        medio = (izquierda + derecha) // 2

        if arreglo[medio] == valor_buscado:
            return medio
        elif arreglo[medio] < valor_buscado:
            izquierda = medio + 1
        else:
            derecha = medio - 1

    return -1

print(busqueda_binaria([1, 2, 3, 4, 5], 2))
print(busqueda_binaria([1, 2, 2, 3, 4, 5], 3))
print(busqueda_binaria([1, 2, 2, 3, 4, 5], 10))