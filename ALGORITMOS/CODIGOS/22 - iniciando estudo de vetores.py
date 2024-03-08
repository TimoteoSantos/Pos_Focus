#trabalhando com vetores em python
vetor = [1,2,3,4,5]
print(vetor[0])

#o metodo .append() adiciona valores a um vetor
#adiciona o valor 6 a proxima posição vazia do vetor
vetor.append(6)
print(vetor[5])

#adicionando varios valores a um vetor
vetor.extend([7,8,9])
print(vetor[7])

#acessando uma faixa de posições dos vetores
print(vetor[1:3])

#for para percorrer os vetores de vetor
for i in vetor:
    print(vetor[0])
    print(i)
