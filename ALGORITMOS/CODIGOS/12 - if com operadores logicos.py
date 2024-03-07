nota = 85
presenca = 85

# se a nota for menor que 70 ou a presenca for menor que 70 o aluno foi reprovado
if nota < 70 or presenca < 70:
  #imprimindo reprovado
  print("Reprovado")
  #verifcar o que deu errado
  if nota < 70:
    print("foi a nota de ", nota, "quem te reprovou")
  if presenca < 70:
    print("foi a presenca de ", presenca, "quem te reprovou")
#para que um aluno seja aprovado nora >= 70 e presenca >= 70
else:
  #imprimindo aprovado
  print("aprovado")
  #se obteve a nota maxima
  if nota == 100 and presenca == 100:
    #imprimindo mensagem se obteve nota maxima
    print("voce alcancou a nota maxima e a presenca maxima")
    
  #se obteve uma boa nota mas nao a maxima
  elif(nota > 80 and nota < 90 ) and (presenca > 80 and presenca < 90):
    #imprimindo mensagem se obteve uma boa nota mas nao a maxima
    print("uma boa nota",nota,"uma boa presenca",presenca)

  #se tirou uma maior que 90
  if nota > 90:
    print("excelente nota",nota)
  elif (nota >= 80 and nota <90):
    print("boa nota",nota)
    
  #se obte uma presenca menor que 75
  if nota < 75:
    print("precisa estudar mais",nota)
  if presenca < 75:
    print("precisa estudar mais",presenca)