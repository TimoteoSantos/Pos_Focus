#operadores aritmeticos

# ** Calcula o exponencial tendo o valor da
#direita como base e pelo valor da direita.
def calcularExponenciacao(base,expoente):
    print (base**expoente)
print(calcularExponenciacao(3,3))

#operador de divisao
def dividir(num,num2):
    print(num / num2)
print(dividir(2,3))

# // Divide o valor da direita pelo da esquerda e
#somente retorna o valor inteiro do resultado.
def dividirEscreverInteiro(num,num2):
    print(num // num2)
print(dividirEscreverInteiro(2,3))

# % Divide o valor da direita pelo da esquer-
#da, e retorna o resto da operação. 
def restoDaDivisao(num,num2):
    print(num % num2)
print(restoDaDivisao(2,2))

#uso de parenteses
print (((3+4)*2)/3)
#o python ira fazer
#3+4
#7*2
#14/3
#pois ira seguir a precedencia dos parenteses



