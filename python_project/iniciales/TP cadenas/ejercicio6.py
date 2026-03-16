#Fecha de nacimiento
#Escribir un programa que pregunte al usuario la fecha de su nacimiento
#en formato dd/mm/aaaa y muestra por pantalla, el día, el mes y el año

fecha = input("ingrese su fecha de nacimiento: ")

partes = fecha.split("/")

if not partes != 3:
    print ("formato incorrecto")
    
dia = (partes[0])
mes = (partes[1])
año = (partes[2])

if not len(dia) == 2 and int(dia) > 0 and int(dia) < 32:
    print("Dia incongruente!")
    exit()
if not len(mes) == 2 and 1 <= int(mes) <= 12:
    print("Mes incongruente!")
    exit()
if not len(año) == 4 and int(año) <= 2025:
    print("Año incongruente!")
    exit()
    
print(f"naciste el dia {dia} del {mes} del {año}")