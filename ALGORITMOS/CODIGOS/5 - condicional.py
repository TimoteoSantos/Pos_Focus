#informacao do banco
usuario = "admin"
senha = "123"

def VerificarLogoin(userName,password):
   if (userName == usuario and password == senha):
       return True
   else:
        return False

#informacao do formulario
userName = input("DIGITE SEU HORRIVEL NOME")
password = input("DIGITE SUA TERRIVEL SENHA")

#verificara login
login = (VerificarLogoin(userName, password))

