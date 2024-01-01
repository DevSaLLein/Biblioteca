vogais = ['a', 'e', 'i', 'o', 'u']

letra = input('Digite uma letra: ')
teste = [ '', '', '', '', ''];

for x in range(0, 5, 1):
    if(letra == vogais[x]):
        teste[x] = 'vogal'
    else:
        teste[x] = 'consoante'

try:
    if(teste.remove('vogal')):
        print('vogal')
    else:
        print('vogal')

except:
    print('consoante')
finally:
    print('Processo finalizado')