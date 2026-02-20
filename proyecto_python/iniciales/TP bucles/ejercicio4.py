#Escribir un programa que pida al usuario un número entero positivo
#y muestre por pantalla todos los números impares desde 1 hasta
#ese número separados por comas

while True:
    num = int(input("Ingrese un numero entero positivo: "))
    if num > 0:
        break
    else:
        num = int(input("Ingrese un numero entero positivo: "))
    
for i in range(num + 1): #El for inicia en 0 y va hasta el numero pero se lo incluye sumando 1.
    if i%2 == 1:
        if i + 2 > num: 
            print(f"{i}", end = ".")
        else:
            print(f"{i}", end = ", ")