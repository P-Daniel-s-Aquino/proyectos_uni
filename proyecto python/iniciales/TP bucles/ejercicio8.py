#Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10

for i in range(1, 11):
    print()
    print(f"\nTabla del {i}: ")
    print("------------")
    for j in range(11):
        if j == 10:
            print(f"{j * i}", end = ".")
        else:
            print(f"{j * i}", end = ", ")   