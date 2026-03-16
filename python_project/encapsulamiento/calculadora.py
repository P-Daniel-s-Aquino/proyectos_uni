# Calculadora
# Realizar un programa en el cual se declaren dos valores enteros por 
# teclado utilizando el método init. Calcular después la suma, resta, 
# multiplicación y división. Utilizar un método para cada una e imprimir los 
# resultados obtenidos. Llamar a la clase Calculadora

class Calculadora:

    def __init__(self, num1 : float = 2, num2 : float = -3) -> None:
        self.num1 = num1
        self.num2 = num2

    def suma(self) -> float:

        return self.num1 + self.num2

    def resta(self) -> float:
        
        return self.num1 - self.num2

    def multip(self) -> float:
        
        return self.num1 * self.num2

    def divis(self) -> float:
        
        if self.num2 == 0:
            print("No se puede dividir por cero")
        
            return 0.0
        
        return self.num1 / self.num2

c1 = Calculadora()

print(f'{c1.suma():.2f}')
print(f'{c1.resta():.2f}')
print(f'{c1.multip():.2f}')
print(f'{c1.divis():.2f}')

c1.num2 = 0

print(f'{c1.divis():.2f}')