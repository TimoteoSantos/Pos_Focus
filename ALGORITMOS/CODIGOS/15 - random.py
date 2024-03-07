'''criar um programa que gera um numreo e dar dicas para o 
usuario tentar acertar qual esse numero

1. o usuario so pode errar 5 vezes
2. o usuario deve saber quantas chances ainda tem
'''

import random

numero = random.randint(1,20)
acertou = False
chances = 0

while acertou == False:
  numeroUsuario = int(input('Digite um numero: '))
  if numeroUsuario == numero:
    print('Acertou')
    acertou = True
  elif numeroUsuario > numero:
    print('Chute mais baixo')
  elif numeroUsuario < numero:
    print('Chute mais alto')
  chances += 1
  if chances == 5:
    print('Acabou as chances')
    acertou = True

