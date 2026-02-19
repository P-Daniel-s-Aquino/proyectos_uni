#Escribir un programa que muestre el eco de todo
#lo que el usuario introduzca hasta que el usuario escriba "salir"

word : str = input("ingresa lo que se te cante, de lo contrario ingrese salir: ")

while word != "salir":
    print(word)
    word = input("ingresa lo que se te cante, de lo contrario ingrese salir: ")