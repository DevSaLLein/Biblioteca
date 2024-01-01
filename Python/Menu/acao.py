notas = {}
alunos = {}

acao = int(
            input(
                "1. Cadastro \n"
                "2. Consultar alunos e notas \n"
                "3. Listar alunos \n"
            )
        )

if(acao == 1):

    dic = {}

    qtd = int(input("Quantos alunos deseja cadastrar?"))
    count = 0

    while count < qtd:
        nome = input("Digite o nome: ")
        nota = int(input("Digite a nota: "))
        alunos[count] = nome
        notas[count] = nota

        dic[nome] = nota

        soma = 0
        for x in dic:
            soma += dic[x]

        count += 1

    media = soma / qtd

    with open ('alunos_notas.txt', 'w') as file:
        for x in dic:
            file.write("\nNome do aluno: " + x )
            file.write("\nNota: " + str(dic[x]))

        file.write("\n\nA média da turma é: " + str(media))

    with open('alunos.txt', 'w') as file:
        for x in alunos:
            file.write('\n' + alunos[x])

    with open('notas.txt', 'w') as file:
        for x in notas:
            file.write('\n' + str(notas[x]))

    acao = int(
        input(
            "1. Cadastro \n"
            "2. Consultar alunos e notas \n"
            "3. Listar alunos \n"
        )
    )



if(acao == 2):
    with open("alunos_notas.txt") as file:
        print(file.read())

    acao = int(
        input(
            "1. Cadastro \n" 
            "2. Consultar alunos e notas \n"
            "3. Listar alunos \n"
        )
    )

if(acao == 3):
    with open('alunos.txt', 'r') as file:
        print(file.read())

    acao = int(
        input(
            "1.Cadastro \n"
            "2.Consultar alunos e notas \n"
            "3.Listar alunos"
        )
    )

else:
    print('Resposta inválida, tente novamente')

    acao = int(
        input(
            "1.Cadastro \n"
            "2.Consultar alunos e notas \n"
            "3.Listar alunos"
        )
    )