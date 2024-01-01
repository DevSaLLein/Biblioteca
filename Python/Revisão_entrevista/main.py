nota = float(input('Digite uma nota: '));

while(nota > 10 or nota < 0):
    print('Nota inválida, digite uma nota entre 0 e 10!');
    nota = int(input('Digite uma nota: '))

if(nota <= 5):
    print('Aluno reprovado')
elif(nota >= 5.1 and nota < 6):
    print('Aluno em recuperação')
elif(nota >= 6):
    print('Aluno aprovado')