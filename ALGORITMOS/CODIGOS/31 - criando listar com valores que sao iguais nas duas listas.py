#criando uma lista com os valores iguais nas duas listas

#lista que recebera os dados das outras duas listas
lista = []
#primeira lista que contem os dados
lista1 = [1,2,3,5]
#segunda lista que contem os dados
lista2 =  [3,1,4,8]

#percorre a primeira lista
for x in lista1:
    #percorre a segunda lista
    for y in lista2:
        #verifica se os dados sao iguais
        if x == y:
            #se gorem adiciona a lista[]
            lista.append(x)
#imprime a lista criada
print(lista)

#criando com uma instrucao de tro do vetor
lista = [x for x in [1,2,3,5] for y in [3,1,4,8] if x == y]
