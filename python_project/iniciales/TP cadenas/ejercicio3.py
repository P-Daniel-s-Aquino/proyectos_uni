#Cantidad de letras
#Escribir un programa que pregunte el nombre del usuario en la consola
#y después de que el usuario lo introduzca muestre por pantalla <NOMBRE> 
#tiene <n> letras, donde <NOMBRE> es el nombre de usuario en mayúsculas y
#<n> es el número de letras que tienen el nombre

username = input("ingrese SOLAMENTE su nombre y nada mas, me escuchaste? A bueno, cuidate...pero cuidate mucho e: ")

print(f"{username} tiene {len(username)} letras, donde {username.upper()} es el nombre en mayusculas y {len(username)} el numero de letras que tiene el nombre")