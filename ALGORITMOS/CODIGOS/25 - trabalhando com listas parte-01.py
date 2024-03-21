#CRIANDO LISTAS

lista = [1, 1.5, True, "texto", [0, 1]]
#trocando o valor de uma posicao
lista[1] = 3.0
#escrevendo um item de uma lista
print(lista[1])

#FATIANDO UMA LISTA
lista = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
#atibuir um intervado de uma lista para criar outra lista
listaFatiada = lista[0:4]
print(listaFatiada)
#acessando valores de um numero ate o ultimo elemento da lista
listaNovaFatiada = lista[4:len(lista)]
print(listaNovaFatiada)

#construir uma nova lista de uma posição inicial até
#o ultimo elemento pulando de dois em dois
listaPares = lista[0:len(lista):2]
print(listaPares)

#fazendo uma copia de uma lista
listaCopia = lista[:]
print(listaCopia)

#fazendo uma copia de uma lista
listaCopia2 = lista[0:len(lista)]
print(listaCopia2)

#fazendo uma copia de uma lista
listaCopia3 = lista.copy()
print(listaCopia3)

#integarindo com listas
lista = [0,1,2,3,4,5,1000,7,8]

#consultar o indice de um elemento de uma lista
print(lista.index(1000)) #escreve qual a posição do valor 1000 na lista

#inserindo valores em uma lista
lista.append(9) #adiciona o valor 9 a ultima posição da lista
print (lista)

#adicionando um valor em uma posição especifica

'''inseri na posicao 6 o valor 6 porem nao remove o valor que estava na
posicao 6 ele move o valor para a posicao 7 e assim por diante'''
lista.insert(6,6)
print(lista)

lista += [10,11,12] #adicionando novos valores a lista a partir de uma nova lista
print(lista)

#removendo valores de listas
lista.remove(0)
print(lista)

#excluindo elemento da lista nao retornando o valor excluido
lista.pop(0) #exclui o valor na posicao 0 o valor foi excluido ou seja não tem como recuperar
print(lista)

#caso use o pop sem informar a posição ele exclui o ultimo elemento da lista
#lista.pop()
#print(lista)

#removendo elementos de uma lista com del
del lista[0] #exlui o valor na posicao 0 porem nao exlui da memoria
print (lista)

#ordenando uma lista
lista.sort() #o metodo sort ordena a lista em orde crescente
print(lista)

#o metodo reverse nao inverte a posicao da lista apenas inverte a ordem
lista.reverse()
print(lista)




