public class Main{

  public static void main(String[] args) {
    //estruturas de repetição

    /* primeiro temos a variavel de controle
    depois a condição de parada depois o incremento
    */
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    
    /* while
    preceba que a condição de parada é uma expressão    booleana e que o while ja sabe o valor inicial de    contador porem diferente do do while que sabe o valor inicial de contador e incrementa antes de testar a condição de parada.
  */
  
  int contador = 0;
  while (contador < 10){
    System.out.println(contador);
    contador++;
  }

  /* do while ele testa depois de passar pelo menos uma vez porque ele testa no final ou seja o seu codigo na primeira vez vai ser executado pelo menos uma vez.
*/
do {
  System.out.println(contador);
  
} while (contador < 10);   


  }  
}