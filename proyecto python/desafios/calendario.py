import calendar
from datetime import datetime

hoy = datetime.now()
anio = hoy.year
mes = hoy.month
dia_actual = hoy.day

cal = calendar.monthcalendar(anio, mes)

print(f"\nCalendario {calendar.month_name[mes]} {anio}\n")
print("Lu  Ma  Mi  Ju  Vi  Sa  Do")

for semana in cal:
    for dia in semana:
        if dia == 0:
            print("    ", end="")  
        elif dia == dia_actual:
            print(f"[{dia:2}]", end="")  
        else:
            print(f" {dia:2} ", end="") 
    print()
