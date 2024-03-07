#usando o comando break podemos fazer com que o programa saia da estrutura de repeticao

for numero in range(11):
    if numero == 7: #se o numero for igual a 7
        break #use o comando break para parar o algoritmo
    print(numero) #escreva os numeros
else:
        print("else")

numero1 = 0

#observe que o que fez o comando parar foi um if com um break e uma condicao ser maior ou igual a 100
while 1:
    numero1 += 3
    if numero1 >= 100:
        break
    print(numero1)