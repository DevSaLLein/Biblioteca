nomes = {}
notas = {}
qtd = int(input('Quantidade de termos: '))

count = 0
while count < qtd:
    nomes[count] = (input("Digite um nome: "))
    notas[count] = int(input("Digite uma nota: "))
    count += 1

print(nomes)
print(notas)

dicionario = {}

count = 0
while count < qtd:
    dicionario[nomes[count]] = notas[count]
    count += 1

print(dicionario)

soma = 0
for x in dicionario.values():
    soma += x

print("A soma total foi de:", soma)
print("A média será", soma / qtd)


teste = {Richard: 10}
teste.values()
teste.keys()