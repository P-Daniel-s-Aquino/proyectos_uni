#Leer tres valores numéricos enteros, indicar cual es el mayor,
#cuál es el del medio y cuál el menor. Considerar que los tres valores son diferentes

num1 = int(input("ingrese el primer numero: "))
num2 = int(input("ingrese el segundo numero: "))
num3 = int(input("ingrese el tercer numero: "))

def ordenar(num1, num2, num3):
    mayor = num1 if num1 > num2 and num1 > num3 else num2 if num2 > num3 else num3
    menor = num1 if num1 < num2 and num1 < num3 else num2 if num2 < num3 else num3
    medio = ((num1 + num2 + num3) - mayor) - menor
    return mayor, medio, menor

mayor, medio, menor = ordenar(num1, num2, num3)

print(f"el mayor es: {mayor}")
print(f"el medio es: {medio}")
print(f"el menor es: {menor}")