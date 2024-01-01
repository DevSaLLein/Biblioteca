user = input('Digite um usuário:')
password = input('Digite uma senha:')

while( user == password):
    print('A senha não pode ser igual a usuário, tente novamente')
    user = input('Digite um usuário')
    password = input('Digite uma senha')