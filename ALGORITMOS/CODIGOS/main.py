#impirmindo em arquivo
'''
a seguir temos uma variavel que recebe o retorno da funcao open
essa funcao abre um arquivo ela tem dois paramentos

1º o nome do arquivo
2º o modo de abertura
caso o arquivo nao exista ele sera criado,
o modo de abertura pode ser:

r - leitura
w - escrita
a - escrita no final do arquivo
x - cria um arquivo e retorna um erro caso ja exista
'''

#ESCREVENDO EM UM ARQUIVO
arquivo = open("escrevendoEmUmArquivo.txt", "w")
#escreve no arquivo
arquivo.write("timoteo")
#escreve o nome do arquivo
print("print no arquivo", arquivo)
#fecha o arquivo
arquivo.close()


