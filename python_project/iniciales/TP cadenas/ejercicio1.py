#Mostrar n veces username
#Escribir un programa que pregunte el nombre del usuario en la consola y un número entero
#e imprima por pantalla en líneas distintas el nombre del usuario tantas veces como el número introducido


username = input("¿como es su nombre de usuario?: ")
number = int(input("ingrese un numero entero: "))

for i in range(number):
    print(username)