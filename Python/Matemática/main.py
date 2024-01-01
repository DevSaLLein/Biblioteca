a = int(input("Digite a primeira medida do triângulo: "))
b = int(input("Digite o segundo medida do triângulo: "))
c = int(input("Digite o terceiro medida do triângulo: "))

if a == b and b == c and a == c:
    print('O triâgulo é equilátero')

if a == b or b == c or a == c :
    print('O triângulo é isósceles')

if a != b and b != c and a != c:
    print('O triângulo é escaleno')

