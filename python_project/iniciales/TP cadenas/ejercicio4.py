#Teléfono sin prefijo ni extensión
#Los teléfonos de una empresa tienen el siguiente formato
#prefijo-número-extension donde el prefijo es el código del país +54,
#y la extensión tiene cuatro dígitos (por ejemplo +54-9115847-1056).
#Escribir un programa que pregunte por un número de teléfono con este
#formato y muestre por pantalla el número de teléfono sin el prefijo y la extensión

#number_phone = input("ingrese su numero de telefono")

#sin_nada = number_phone.split("-")

#print (f"el numero de telefono sin extension ni prefijo es: {sin_nada[1]}")


from typing import List


telefono = input('Ingrese un telefono: ')

partes: List[str] = telefono.split('-')

if len(partes) != 3:
    print(f'Numero de telefono {telefono} invalido. faltan -.')
    exit()

prefijo = partes[0] 
numero = partes[1] 
extension = partes[2]

if not(prefijo.startswith('+') and prefijo[1:].isdigit() and len(prefijo) == 3):
    print(f'El prefijo {prefijo} es invalido, debe ser + y 2 numeros')
    exit()

if not(len(numero) == 7):
    print(f'El numero debe tener 7 digitos')
    exit()

if not(len(extension) == 4):
    print(f'La extension {extension} debe ser de 4 digitos')

print(f'El numero es {partes[1]}, con la extension {partes[1]}-{partes[2]}, el numero completo es {telefono}')