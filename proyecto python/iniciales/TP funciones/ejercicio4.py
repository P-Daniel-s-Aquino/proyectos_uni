#Escribir una función que calcule el total de una factura tras aplicarle el IVA. 
#La función debe recibir la cantidad sin IVA y el porcentaje de IVA a aplicar, y devolver el total de la factura.
#Si se invoca la función sin pasarle el porcentaje de IVA, deberá aplicar un 21%

fact = float(input("ingrese el monto: "))
iva = int(input("ingrese el porcentaje a aplicar: "))

def calc(fact, iva):
    porcentaje = (iva / 100) + 1
    return fact * porcentaje

if iva == 0:
    print(f"el total de la factura es: {calc(fact, 21)}")
else:
    print(f"el total de la factura es: {calc(fact, iva)}")