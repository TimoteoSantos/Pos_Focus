public class Main
{
    public static void main(String[] args){

        //forma de instanciar uma classe generica

        //outra coisa a ser observada é o tipo que instanciamos como Intiger e nao int
        Generics<String,Integer> g = new Generics<>("timoteo",1);

        //escrevendo os dados de uma classe generica ou seja nao tem tipo de dados na classe
        //esse recurso é ultilizado quando nao sabemos que tipo de dado iremos trabalhar

        System.out.println(g.getValue() + g.quantidade);
        
    }
}