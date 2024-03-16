'''
o sistema deve gerar um numero aleatorio o usuario deve digitar ate acertar
mas se o usuario tentar mais de 10 vezes o sitema deve dizer que ele esgotou o numero
de tentativas, quando chegar em cinco tentativas o usuario deve ser avisado e o
sistema mostra uma contagem regressiva para o usuario, o usuario comeca com dez pontos
a cada erro o usuario perde um ponto, e o sistema mostra quantos pontos o usuario ainda tem
'''
import os
import  random

robo = random.randint(1,10)
print(robo)
jogador = int(0)
chance = 10
contador = 0

#laco ate acertar o numero
while robo != jogador:
    print("------------------------------------------")
    jogador = int(input(" [ DIGITE O SUA APOSTA ] \n"))#recebendo numero do jogador
    print("------------------------------------------")
    print("[ ULTIMO NUMERO DIGITADO ",jogador , " ] \n")
    if (chance > 5):
        chance = chance - 1
    elif (chance > 0):
        chance = chance - 1
        print("=================================================================")
        print("SUAS CHANCES ESTAO ACABANDO VOCE AINDA TEM ", chance, "CHANCES \n")
        print("=================================================================")
    elif (chance == 0):
        break
    print(robo)
else:
    print("UIA !!! VOCÊ ACERTOU :) ")
