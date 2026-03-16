# Persona
# Crea una clase Persona. Con atributos nombre y edad. Además, crear un método 
# cumpleaños, que aumente en 1 la edad de la persona cuando se invoque sobre un 
# objeto creado con Persona

class Persona:
    def __init__(self, nombre : str, edad : int) -> None:
        self.__nombre = nombre
        self.__edad = edad

    # Getters
    @property
    def nombre(self) -> str:
        return self.__nombre

    @property
    def edad(self) -> int:
        return self.__edad

    # Setters
    @nombre.setter
    def nombre(self, otro : str) -> None:
        self.__nombre = otro

    @edad.setter
    def edad(self, otro : int) -> None:
        self.__edad = otro

    @property
    def cumpleanios(self) -> None:
        self.edad += 1

if __name__ == '__main__':
    p1 = Persona('Enzo', 24)
    print(f'{p1.nombre}, {p1.edad}')
    p1.cumpleanios
    print(p1.nombre, p1.edad)
