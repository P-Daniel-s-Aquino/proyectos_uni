#Para tributar un determinado impuesto se debe ser mayor de 18 años
#y tener unos ingresos igual eso superiores a 500000 ARS mensuales. 
#Escribir un programa que pregunte al usuario su edad y sus ingresos 
#mensuales y muestre por pantalla si el usuario tiene que tributar o no.

edad = 24
ingreso = 000

if edad >= 18 and ingreso >= 500000:
    print("podes tributar")
else:
    print("No podes tributar")