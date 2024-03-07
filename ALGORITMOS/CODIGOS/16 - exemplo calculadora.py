#estudando funcoes

def calculadora(operacao,valor1,valor2):
    if operacao == "+":
        return valor1 + valor2
    elif operacao == "-":
        return valor1 - valor2
    elif operacao == "*":
        return valor1 * valor2
    elif operacao == "/":
        return valor1 / valor2

print ("ESCOLHA O TIPO DA OPERACAO")

operador = int(input(" 1 para soma \n 2 para subtracao \n 3 para multiplicacao \n 4 para divisao"))

if operador == 1:
    operacao = "+"
elif operador == 2:
    operacao = "-"
elif operador == 3:
    operacao = "*"
elif operador == 4:
    operacao = "*"


resultado = calculadora(operacao,2,2)

print(resultado)

