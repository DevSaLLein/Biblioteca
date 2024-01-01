A = 80000
B = 200000

taxaA = 0.03
taxaB = 0.015

anos = 1

while( A <= B):

    populacaoA = (A * taxaA)
    populacaoB = (B * taxaB)

    A += populacaoA
    B += populacaoB

    anos += 1

print(anos)
