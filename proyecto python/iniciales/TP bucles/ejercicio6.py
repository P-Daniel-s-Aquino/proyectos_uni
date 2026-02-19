#Escribir un programa que pregunte al usuario una cantidad a invertir,
#el interés anual y el número de años, y muestre por pantalla el
#capital obtenido en la inversión cada año que dura la inversión

cant = float(input("ingrese la cantidad a invertir: "))
interes = float(input("ingrese el interes anual: "))
año = int(input("ingrese el numero de años: "))

porc = (interes / 100) + 1

for i in range(año): 
    cant *= porc
    print(f"El {i + 1}° se recaudo {cant}$")