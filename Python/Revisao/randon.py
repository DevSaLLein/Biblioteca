import random
import matplotlib.pyplot as plt

count = 0
variavel = [0,0,0,0,0,0]

5
while( count < 6):
    variavel[count] = (random.randint(1,9))
    count += 1

for x in range(0, 6, 1):
    if( variavel[x] % 2 == 0):
        print('par:', variavel[x] + 3)
    else:
        print('impar:', variavel[x] * 2)

grafico = {}

for x in range(0, 6, 1):
    grafico[x] = variavel[x]

print(variavel)
print(grafico)

plt.grid()
plt.plot(grafico.keys(), grafico.values(), marker='o')
plt.show()
