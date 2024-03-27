#trabalhando com listas

lista  = [0,1.5,True,"texto"]

#sustituir um valor da lista
lista[0] = 5
#escrevendo uma lista
print(lista)

#removendo um valor de uma lista
lista.remove(5) #removendo o valor 5
print(lista)

#lista com 10 posicoes
lista = [0,1,2,3,4,5,6,7,8,9,10]
print(lista)

#uma lista de um internvalo de outra lista
novaLista = lista[0:4] #criando uma lista a partir de outra
print(novaLista)

#lista de uma posicao ate o final da lista
novaLista2 = lista[0:len(lista)]
print(novaLista2)

#uma lista de uma posicao inicial ate o final da lista pulando de acordo com o ultimo parametro :2
novaLista3 = lista[0:len(lista):2]
print(novaLista3)

#copiar uma lista
novaLista4 = lista.copy()
print(novaLista4)

# a funcao len nos retorna o numero de posicoes de uma lista
print(len(lista))

lista = [0,1,2,3,4,5,6000,7,8,9,10]

#o metodo index consulta a posicao de um valor na lista
print(lista.index(6000))

#inserindo valores na lista

#criando uma lisjta
lista = [0,1]

#adicionando na ultima posicao um valor
lista.append(3)

#adicionar um valor a uma posicao
lista.insert(0,4)

#adicionar uma lista a uma lista
lista += [2,3,4]
print(lista)

#remover valores de lista o primeiro valor 4 que for encontrado
lista.remove(4)
print(lista)















