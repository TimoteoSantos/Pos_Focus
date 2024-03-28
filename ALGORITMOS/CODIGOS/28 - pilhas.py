'''
podemos ter uma pilha que é uma lista, mas podemos ter uma fila que é uma lista também, mas com as operações de empil, podemos
empilhar ou desempilhar, e com as operações de enfileirar, 
podemos enfileirar ou desenfileirar.
para enfileirar usamos o push e desempilhar usamos o pop

a pilha é uma estrutura de dados que segue a lógica LIFO, ou seja, o último a entrar é o primeiro a sair
'''
#criando uma pilha
pilha = [0,1,2,55]

#coloca na ultima posicao um valor
pilha.append(10)
#escreve a pilha
print(pilha)
#retira o valor da ultima posicao
pilha.pop()
#escreve a pilha
print(pilha)
#retira o valor da ultima posicao
pilha.pop()
#escreve a pilha
print(pilha)
#coloca o valor de 500 na ultima posicao
pilha.append(500)
#escreve a pilha
print(pilha)

'''
preceba que estamos interagindo com o valor da ultima posicao
da estrutura de dados pilha, que segue o padrao LIFO o ultimo a entrar é o primeiro a sair
'''





