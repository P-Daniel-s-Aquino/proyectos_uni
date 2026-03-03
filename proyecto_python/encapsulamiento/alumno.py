# Estudiante
# Realizar un programa que conste de una clase llamada Estudiante, 
# que tenga como atributos el nombre y la nota del alumno. Definir los métodos 
# para inicializar sus atributos, imprimirlos y mostrar un mensaje con el resultado 
# de la nota y si ha aprobado o no

class Alumno:
    def __init__(self, nombre : str, nota : int) -> None:
        self.__nombre = nombre
        self.__nota = nota

    # Getters
    @property
    def nombre(self) -> str:
        return self.__nombre

    @property
    def nota(self) -> int: 
        return self.__nota

    # Setters
    @nombre.setter
    def nombre(self, otro : str) -> None:
        self.__nombre = otro

    @nota.setter
    def nota(self, otro : int) -> None:
        self.__nota = otro


if __name__ == '__main__':
    ps1 = Alumno('daniel', 2)

    print(ps1.nombre)
    print(ps1.nota)
    ps1.nota = 8
    print(ps1.nota)
    
    print(f'{ps1.nombre} tiene un {ps1.nota} de nota.')