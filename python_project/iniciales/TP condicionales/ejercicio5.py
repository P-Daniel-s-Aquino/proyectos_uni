#Los tramos impositivos para la declaración de la renta anual en un determinado país son los siguientes:

#Renta	Tipo impositivo
#Menos de 10000 USD	            5%
#Entre 10000 USD y 20000 USD	15%
#Entre 20000 USD y 35000 USD	20%
#Entre 35000 USD y 60000 USD	30%
#Más de 60000 USD	            45%
#Escribir un programa que pregunte al usuario su renta anual y muestre por pantalla el tipo impositivo que le corresponde

while True:
    renta_anual = int(input("¿Cual es su renta anual: "))

    if renta_anual <= 0:
        print("valor de renta invalida! bai")
        break        
    elif renta_anual < 10000:
        print("te corresponde el %5")
    elif 10000 <= renta_anual <= 20000:
        print("te corresponde el %15")
    elif 20000 <= renta_anual <= 35000:
        print("te corresponde el %20")
    elif 35000 <= renta_anual <= 60000:
       print("te corresponde el %30")
    else:
        print("te corresponde el %45") 