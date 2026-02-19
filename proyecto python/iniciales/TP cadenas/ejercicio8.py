#Escribir un programa que pregunte el nombre de un producto,
#su precio y un número de unidades y muestre por pantalla una cadena
#con el nombre del producto seguido de su precio unitario con 6 dígitos
#enteros y 2 decimales, el número de unidades con tres dígitos y el coste
#total con 8 dígitos enteros y 2 decimales

product = input("Ingrese el nombre del producto: ")
price = float(input("Ingrese el precio: "))
unit = int(input("ingrese las unidades: "))

total = float(price * unit)

print(f"El producto {product} tiene como precio {price: 06.2f}$ y hay {unit: 03d}, el precio total es: {total: 06.2f}$")