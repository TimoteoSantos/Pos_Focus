
public class Main
 {

     //enumeradores sao um tipo de dado que voce pode criar com valores fixos
     public enum Lojas{
         loja01,loja02,loja03,loja04,loja05;
     }

    public static void main(String[] args){
        int x = 10;
        //perceba que no lugar do %d o sistema escreve o que esta na variavel
        System.out.printf("O valor da variavel x é %d", x);

        //podemos declarar variaveis de varias formas no java
        int variavel;
        int variavelNova = 10;
        int variavelNova2 , variavelNova3;
        int variavelNova4 = 10, variavelNova5;

        /*a declaracao de variaveis em uma mesma linha nao é recomendável
        pois pode deixar o codigo confuso, o ideal é que as variaveis sejam
        declaradas em suas proprios linhas */

        //tipagem implicita é quando nao informamos qual o tipo da varivel apenas o valor e o java
        //usa a tipagem dinamica para a variavel

        var anoAtual = 2021;

        /*declaracao de constantes constantes sao delacradas com a palavra reservada
        final e nao podem ter seus valores alterados*/

        final int idade = 13;
        System.out.printf("Tenho a idade de %d e nasci em %d",idade , anoAtual);

        //tipos de dados booleanos
        var pessoaFisica = true;
        var pessoaJuricica = false;

        //tipo char
        String sexo = "m";
        var loja = Lojas.loja01;
        System.out.printf(String.valueOf(loja));
    }
 }