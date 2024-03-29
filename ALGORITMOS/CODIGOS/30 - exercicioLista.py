'''
Escreva um programa que recebe como entrada do usuário uma lista de 5 números
inteiros e cria uma lista com os mesmos números multiplicados por 5.
'''

#cria uma variavel que vai armazenar a lista
lista = []

#enquanto a lista nao tiver 5 posicoes
while len(lista) < 5:
    #se nao ouve erro durante a digitacao do usurio
    try:
        #o valor digitado é inserido na ultima posicao do vetor
        lista.append(5 * int(input('digite um numero')))
    #caso o usuario digitou um valor nao intiero
    except(ValueError):
        #mesagem de erro
        print('o numero nao é inteiro')
#escreve uma lista
print (lista)
