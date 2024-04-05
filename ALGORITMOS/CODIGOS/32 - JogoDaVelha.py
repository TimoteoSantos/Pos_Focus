#uma funcao que retorna um list com todos os dados zerados
def novoTabuleiro():
    #retorna um array com 9 posicles
    lista =  [0,0,0, 0,0,0, 0,0,0]
    return  lista

#funcao que coloca valores na lista e organiza vizualmente a lista recebida por parametro
def imprimirTabuleiro(tabuleiro):
    '''esse for percorre o tabuleiro usando a funcao enumerate
    a funcao enumerate() retorna o indice e o valor de uma lista a variavel indice
    recebe nesse caso a posicao do tabuleiro e a variavel valor recebe o valor
    '''
    for indice,valor in enumerate(tabuleiro):
       #se o valor da posicao recebida for zero ninguem ainda usou essa posição
        if valor == 0:
            #se for zero escrever o indice
            print("", indice + 1,sep=" ",end=' ') #acrescentamo +1 ao indice para fascilitar o entendimento do jogador
        #se for 1 o jogador que joga como 1 usou a posicao
        elif valor == 1:
            #escreva um X na posicao que o jogador escolheu
            print(" X", end='')
        #se nao é 0 nem 1 entao é uma posicao escolhido pelo outro usuario
        else:
           print (" O", end='')
           '''se o indece ou seja a posição for 2 ou seja a terceira posicao da coluna ou a
      quinta quebre uma linha esse trecho por se so transforma a lista em tabuleiro '''

        #caso seja o final de uma linha
        if indice == 2 or indice == 5:
            #quebre uma linha caso a condicao anterior seja antendida
            print("\n----+----+----\n",end='')#quebrando uma linha antes e deois da coluna

        #se nao for o final de uma linha escreva |
        elif indice < 8:
            print(" |",end='')

#funcao que recebe a jogada do jogador
def receberJogada(jogador):
    jogada = int(input("Digite a posicao a jogar 1-9 (jogador $s):" % jogador))
    return jogada

tabuleiro = novoTabuleiro()
jogador = str("X")
imprimirTabuleiro(novoTabuleiro())
jogada = receberJogada(jogador)