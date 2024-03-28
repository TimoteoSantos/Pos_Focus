'''
a estrutura de dados fila é uma estrutura de dados que segue o principio FIFO (first in first out) o primeiro a entrar é o primeiro a sair
'''

#importando a biblioteca queue
from collections import deque
#criando uma fila
fila = deque([1,2,3,4,5])
#adicionando valores a fila
fila.append(4)
fila.append(50)
#removendo valores da fila
fila.popleft()
#imprimindo a fila
print(fila)

'''
preceba que esse codigo segue o conceito de fila
o primeiro a entrar é o primeiro a sair
'''