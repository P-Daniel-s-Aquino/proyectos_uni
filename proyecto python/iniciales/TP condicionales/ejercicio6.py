#En una determinada empresa, sus empleados son evaluados al final de cada año.
#Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir
# aumentando, traduciéndose en mejores beneficios. Los puntos que pueden
# conseguir los empleados pueden ser 0.0, 0.4, 0.6 o más, pero no valores 
# intermedios entre las cifras mencionadas. A continuación, se muestra una
# tabla con los niveles correspondientes a cada puntuación. La cantidad de 
# dinero conseguida en cada nivel es de 500.000 ARS multiplicada
# por la puntuación del nivel

#Nivel	Puntuación
#Inaceptable	0.0
#Aceptable	    0.4
#Meritorio	    0.6 o más

#Escribir un programa que lea la puntuación del usuario e indique
# su nivel de rendimiento, así como la cantidad de dinero que recibirá el usuario

while True:
    puntos = float(input("Ingrese los puntos del empleado para la evaluación final: "))

    if puntos in (0.0, 0.4, 0.6):
        break
    else:
        print("Puntos inválidos! Ingrese nuevamente.")


adicional = 500000 * puntos

if puntos == 0.0:
    print(f"Su puntuación es Inaceptable, la cantidad que corresponde es: ${adicional:.2f}")
elif puntos == 0.4:
    print(f"Su puntuación es Aceptable, la cantidad que corresponde es: ${adicional:.2f}")
else:
    print(f"Su puntuación es Meritorio, la cantidad que corresponde es: ${adicional:.2f}")