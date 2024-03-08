#print é uma função que recebe como argumento o que sera impresso

print ("estou escrevendo") #escrevendo dados como string

print ("vou concatenar", 66) #escrevendo com concatenação

print(6+6) #escrevendo a soma dos dois valores

print("sou uma linha \n sou outra linha")# quebra de linha

#criando variavies
a = 0
b = 1
#imprimindo variaveis concatenadas
print("a= ",a,"e b= " ,b)

#ultilizando o modigicador sep
print("a= ",a,"e b= " ,b,sep='\t')# usando tabulacao

#usando o comando end ele coloca espacos
print("a=",a,"e b=",b, end=' ')# usando tabulacao

#crie um programa que escreve os numeros pares entre 1 e 100 e nao mostre o numero 60
#para cada numero pule uma linha

for i in range(100):
    resto = i % 2
    if resto == 0:
        if i == 60:# se for 60 nao vai imprimir
            continue
    print(i)