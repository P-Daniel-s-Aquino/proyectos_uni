# Punto
# Crear la clase Punto que tendrá dos atributos numéricos, x e y, que 
# representarán las coordenadas del punto dentro del plano. Implemente los siguientes métodos:
# estaSobreElEjeX(): devuelve valor booleano
# estaSobreElEjeY(): devuelve valor boolean
# esElOrigenDeCoordenadas(): devuelve valor booleano
# distanciaAlOrigen(): devuelve valor numérico
# distancia(Punto p1, Punto p2): devuelve valor numérico
# distancia(Punto p): devuelve valor numérico

class Punto:
    def __init__(self, x : float, y : float) -> None:
        self.x = x
        self.y = y

    def esta_sobre_eje_x(self) -> bool:
        
        return self.y == 0
        
    def esta_sobre_eje_y(self) -> bool:
        
        return self.x == 0 

    def es_origen(self) -> bool:

        return self.x == 0 and self.y == 0

    def distancia_al_origen(self) -> float: 

        return (self.x**2 + self.y**2)**(1/2)

    def distancia(self, otro: 'Punto') -> float:

        return ((self.x - otro.x)**2 + (self.y - otro.y)**2)**(1/2)

    @staticmethod
    def distancia2(p1: 'Punto', p2: 'Punto') -> float:
        
        return ((p1.x - p2.x)**2 + (p1.y - p2.y)**2)**0.5

    def __str__(self) -> str:
        
        return(f'[{self.x} ; {self.y}]')

if __name__ == "__main__":
    p1 = Punto(3, 4)
    p2 = Punto(0, 2)

    print(f'La distancia al origen es: {p1.distancia_al_origen()} u.')
    print(f'La distancia al origen es: {p2.distancia_al_origen()} u.')

    print(f'Esta sobre el eje x? {p1.esta_sobre_eje_x()}')
    print(f'Esta sobre el eje x? {p2.esta_sobre_eje_x()}')

    print(f'Esta sobre el eje x? {p1.esta_sobre_eje_y()}')
    print(f'Esta sobre el eje x? {p2.esta_sobre_eje_y()}')

    print(f'La distancia entre {p1} y {p2} es de {p1.distancia(p2)} u.')

    print(Punto.distancia2(p1, p2))