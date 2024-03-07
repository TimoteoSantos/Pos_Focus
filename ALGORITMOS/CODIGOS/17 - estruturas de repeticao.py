#estruturas de repeticao 
#while, for, foreach

#while enquanto uma condicao for verdadeira
numero = 0
repetir = 3

while numero <= repetir:
    print(numero)
    numero += 1

#usando else no comando while
numero = 1
print(numero)

while numero < 5:
    numero += 1
    print(numero)
else: #quando a condicao nao for mais atendida entrara nessa condicao falsa
    print("numero maior que 5") #ira imprimir quando sair do enquanto

#comando for tem uma repeticao finita
for letra in "texto": #a variavel letra recebe a string texto
    print(letra) #escreve cada letra da variavel letra

#o for trabalha com sequancia em vez de condicao 
for numero in range(10): #repita esse codigo 10 vezes
    print (numero)

#usando a funcao() range podemos determinar um intervalo entre numeros 
for numero in range(1,10):
    print(numero)

#usando a funcao range() tambem podemos fazer um intervalo com incremento como 
#por exemplo fazermos uma sequencia de 2 em 2 numeros
for numero in range(0,11,2):#o ultimo argumento diz respeito ao incremento
    print(numero)#escrevendo os dados gerados pelo for com incremento


    
    
