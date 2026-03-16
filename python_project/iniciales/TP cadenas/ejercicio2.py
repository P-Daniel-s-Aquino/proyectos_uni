#Mostrar nombre en min, MAY y Capital
#Escribir un programa que pregunte el nombre completo del usuario en la consola
#y después muestre por pantalla el nombre completo del usuario tres veces, una con
#todas las letras minúsculas, otra con todas las letras mayúsculas y otra solo con la
#primera letra del nombre y de los apellidos en mayúscula. El usuario puede introducir 
#su nombre combinando mayúsculas y minúsculas como quiera


username = input("ingrese su nombre completo: ")

print(username.lower())
print(username.upper())
print(username.capitalize())
print(username.title())