#comentário LISTA-----------------------------------

notas = [ 0, 5.2, 7.2, 0, 3.2, 0, 0 ];
soma = 0;

for x in notas:
    soma += x;
    media = soma / len(notas);

print('A soma é: ', round(soma));
print(' A média é:', media);

#Outro estilo-----------------------------------

media = round((sum(notas)) / len(notas));
print("  A média automática sem ter casas decimais é ",media);

#REMOVER-----------------------------------

for x in notas:
    if( x == 0):
        notas.remove(0);

print('  ',notas);

notas.append(4);
notas.append(6.7);
notas.pop(0);

print('   ', notas);



abc = 'ae';
vogais = ['a', 'e', 'i', 'o', 'u'];

count = 0
for x in vogais:
    if(abc == vogais[count]):
        vogais.remove(vogais[count])
        count += 1

print(abc)
print(vogais)
