#Carrito de compras
#Escribir un programa que pregunte por consola por los productos de un carrito de compras, separados por comas, y muestre por pantalla cada uno de los productos en una lÃ­nea distinta

producto = input("ingrese sus productos separados por coma: ") 

productos = producto.split(", ")

for i in (productos):
    print(i)