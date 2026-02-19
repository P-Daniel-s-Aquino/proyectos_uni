#La pizzería Napoli ofrece pizzas vegetarianas y no vegetarianas a sus
#clientes. Los ingredientes para cada tipo de pizza aparecen a continuación

#Ingredientes vegetarianos: Pimiento y tofu.
#Ingredientes no vegetarianos: Peperoni, Jamón y Salmón.
#Escribir un programa que pregunte al usuario si quiere una pizza
#vegetariana o no, y en función de su respuesta le muestre un menú 
#con los ingredientes disponibles para que elija. Solo se puede eligir
#un ingrediente además de la mozzarella y el tomate que están en todas
#la pizzas. Al final se debe mostrar por pantalla si la pizza elegida
#es vegetariana o no y todos los ingredientes que lleva. 

pizza = input("¿Quiere una pizza vegetariana: ")

if pizza.lower() == "si":
    ingrediente = input("Eliga uno de los siguientes ingredientes (Pimiento/Tofu): ")
    if ingrediente.lower() == "Pimiento":
        print (f"Excelente! Su pizza con tomate, mozzarella y {ingrediente}")
    else:
        print (f"Excelente! Su pizza con tomate, mozzarella y {ingrediente}")
else:
    ingrediente = input("eliga uno de estos ingredientes(Peperoni/Jamon/Salmon): ")    
    if ingrediente.lower() == "Peperoni":
        print (f"Excelente! Su pizza con tomate, mozzarella y {ingrediente}")
    elif ingrediente.lower() == "Jamon":
        print (f"Excelente! Su pizza con tomate, mozzarella y {ingrediente}")
    else:
        print (f"Excelente! Su pizza con tomate, mozzarella y {ingrediente}")