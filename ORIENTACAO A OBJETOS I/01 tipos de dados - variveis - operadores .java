class main
{
    public static void main(String[] args){

        int x = 10;
        System.out.printf("o valor de x é %d%n", x);

        //variaveis e tipos de dados
        //TIPOS PRIMITIVOS

        /*boolean = armazena verdadeiro ou falso
        byte, short, int e long: inteiros
        float e double: numeros decimais
        char: texto */

        //TIPOS NAO PRIMITIVOS
        /*
        * String
        * Enumeraçoes
        * Arrays
        * Referencia a objetos
        * */

        //DECLARACAO DE VARIAVEIS
        /*
        * Há duas maneiras de declarmos variaveis
        * a primeira é com o tipo da variavel explicito
        * a outra forma é iniciarmos a variavel com a palavra var mas será obrigado inicializa-la
        * para que o java saiba qual o tipo de dados estamos atribuindo a variavel
        * */
        int idade;
        var peso = 65.250;
        int p = 20 , y = 50; // as duas variaveis tem o valor de 50
        System.out.println(p + y);

        //dados boolean
        var verdadeiro = true;
        var falso = false;
        System.out.println(verdadeiro == falso);
        System.out.println(verdadeiro != falso);

        //OPERADORES LOGICOS

        /*
        * && = E
        * || = OU
        * !  = NAO
        */

        boolean v1 = true , v2 = true;
        boolean f1 = false, f2 = false;

        // && = E
        System.out.println("comparação entre (&&)");

        System.out.println(v1 && v2);
        System.out.println("\n");

        System.out.println(v1 && f2);
        System.out.println("\n");

        System.out.println(f1 && v2);
        System.out.println("\n");

        System.out.println(f1 && v2);
        System.out.println("\n");

        System.out.println(f1 && f2);
        System.out.println("\n");

        // || = OU
        System.out.println("compração entre ||");

        System.out.println();


    }
}