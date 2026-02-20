#Escribir un programa en el que se pregunte al usuario
#por una frase y una letra, y muestre por pantalla el 
#nÃºmero de veces que aparece la letra en la frase.

frase = input("tirate un facto: ")
letra = input("ingrese la letra a buscar: ")

j = 0
for i in frase[1:]:
    if i == letra:
        j += 1

print(f"la letra fue encontrada en el FaCto! unas {j} veces")