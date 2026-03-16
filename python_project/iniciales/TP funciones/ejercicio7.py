# Fecha anterior y posterior
# Implementar una función que recibe dos enteros de 8 dígitos con el formato aaaammdd, 
# informar cuál de las dos es la anterior y cuál la posterior

fecha1 = int(input('Ingrese una fecha en formato AAAAMMDD: '))
fecha2 = int(input('Ingrese otra fecha en formato AAAAMMDD: '))

def fecha(fecha1, fecha2) -> int:
    resultado = fecha1 - fecha2
    if resultado < 0:
        print(f'Fecha anterior {fecha1}')
        print(f'Fecha posterior {fecha2}')
        return resultado
    elif resultado > 0:
        print(f'Fecha posterior {fecha1}')
        print(f'Fecha anterior {fecha2}')
        return resultado
    else:
        print('son la misma fecha')
        return resultado

fecha(fecha1, fecha2)
