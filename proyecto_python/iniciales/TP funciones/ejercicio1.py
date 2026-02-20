#Decimal a binario
#Escribir una función que convierta un número decimal en binario y otra que convierta un número binario en decimal

num_dec: int = int(input('Ingrese un numero en decimal: '))
num_bin = input('Ingrese un numero en binario: ')

def num_binario(num_dec) -> list:
    binario = []
    while num_dec > 0:
        resto = num_dec % 2
        binario.append(resto)
        num_dec //= 2
    return binario[::-1]
print(num_binario(num_dec))

def num_decimal(num_bin) -> int:
    decimal = 0
    potencia = 0
    for digito in reversed(num_bin):
        decimal += int(digito) * (2 ** potencia)
        potencia += 1
    return decimal

es_binario = True
for digito in num_bin:
    if digito != '0' and digito != '1':
        es_binario = False

if es_binario:
    binario = list(num_bin)
    print(num_decimal(binario))
else:
    print("Error: el numero ingresado no es binario")