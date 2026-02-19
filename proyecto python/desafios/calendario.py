import calendar
from datetime import datetime

ROJO = "\033[31m"
RESET = "\033[0m"

hoy = datetime.now()
anio = hoy.year
mes = hoy.month
dia_actual = hoy.day

cal = calendar.monthcalendar(anio, mes)

print(f"\nCalendario {calendar.month_name[mes]} {anio}\n")
print(" Lu  Ma  Mi  Ju  Vi  Sa  Do")

for semana in cal:
    for dia in semana:
        if dia == 0:
            print("    ", end="")  
        elif dia == dia_actual:
            print(f"{ROJO}[{dia:2}]{RESET}", end="")  
        else:
            print(f" {dia:2} ", end="") 
    print()
