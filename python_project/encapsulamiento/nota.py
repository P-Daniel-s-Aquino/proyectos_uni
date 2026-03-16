# Nota
# Crear la clase Nota:
# 
# constructor que reciba como parámetro valorInicial comprendido entre 0 y 10
# obtenerValor(): devuelve el valor numérico de la Nota, comprendido entre 0 y 10
# aprobado(): devuelve valor booleano que indica si la Nota permite o no la aprobación
# desaprobado(): devuelve valor booleano que indica si la Nota implica desaprobación
# recuperar(nuevoValor): recibe como parámetro nuevoValor comprendido entre 0 y 10 y modifica
# el valor numérico de la Nota,
# cambiándolo por nuevoValor, siempre y cuando nuevoValor sea superior al valor numérico actual

class Nota:
    def __init__(self, valor_inicial : int) -> None:
        self.validar_rango(valor_inicial)
        self.valor_inicial = valor_inicial

    def validar_rango(self, valor : int) -> None:
        
        if not (0 <= valor <= 10):
        
            raise ValueError('El valor debe estar entre 0 y 10')

    def obtener_valor(self) -> int:
        
        return self.valor_inicial

    def aprobado(self) -> bool:

            return self.obtener_valor() > 6

    def desaprobado(self) -> bool:

            return not self.aprobado()

    def recuperar(self, nuevo_valor : int) -> None:
        self.validar_rango(nuevo_valor)

        if nuevo_valor > self.valor_inicial:
            self.valor_inicial = nuevo_valor

        else:
            print(f'El valor nuevo {nuevo_valor} no supera al valor original {self.valor_inicial}')

try:
    n1 = Nota(3)

    print(n1.obtener_valor())   
    print(n1.aprobado())    
    print(n1.desaprobado()) 

    n1.recuperar(3) 

    n1.recuperar(10)    

    print(n1.obtener_valor())   
    print(n1.aprobado())    
    print(n1.desaprobado())


    # n2 = Nota(-10)
    
    # n2.recuperar(-10)

    n3 = Nota(4)

    n3.obtener_valor()
except ValueError as e:
    print(e)
