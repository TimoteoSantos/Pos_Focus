
class main {

    //trabalhanco com enumerador perceba que ele se comporta com um metodo da classe
    //ai criar esse enum Naipes estamos criando um novo tido de dados que pordemos ultilizar em nosso projeto
    public enum Naipes {
        Paus, Ouro, Copas, Espadas;
    }
    public static void main(String[] args) {

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
        int p = 20, y = 50; // as duas variaveis tem o valor de 50
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

        boolean v1 = true, v2 = true;
        boolean f1 = false, f2 = false;

        // && = E
        System.out.println("comparação entre (&&)");

        System.out.println(v1 && v2);
        System.out.println(v1 && f2);
        System.out.println(f1 && f2);
        System.out.println(f1 && v2);

        // || = OU
        System.out.println("compração entre ||");
        System.out.println(v1 || v2);
        System.out.println(v1 || f2);
        System.out.println(f1 || v2);
        System.out.println(f1 || f2);

        // ! = NEGACAO
        System.out.println("operador de negação !");
        System.out.println(!v1);
        System.out.println(!f1);

        //podemos combinar esses operadores para fazer algum teste
        var complexo = v1 && !(v2 || f2);
        //primeiro entre parenteses que resultara em true pois um dos valores é verdadeiro
        //agora iremos testar se v1 e o nosso true sao verdadeiro porem o nosso true foi
        //alterado pelo operador de negação e passou a ser false entao o valor sera false

        //TIPOS DE DADOS INTEIROS
       /* tipo byte oculpa de -128 até 127
         * tipo short colupa de –32.768 até 32.767
         * tipo int oculpa de –2.147.483.648 até 2.147.483.647
         * tipo long oculpa –9.223.372.036.854.775.808 até 9.223.372.036.854.775.807        *
         */

        //TIPOS FLUTUANTE

        /* temos o float que oculpa 32 bis e o double que oculpa 64 bits
         */
        //embora existam muitos tipos ultilizamos poucos tipos principalmente usamos o int e o double

        //CONVERSAO DE TIPO DE DADOS
        /*

        int inteiro = 0;
        short inteiro2 = inteiro;
        //resulta em erro porque o short nao suporta a quantidade de dados que um inteiro
        //o que pode causar inconsistencia ja que a variavel inteiro poderia ter uma quantidade muito grande de
        //dados que uma variavel short nao suportaria
        */

        int inteiro = 10;
        short inteiro2 = (short) inteiro;
        System.out.println(inteiro2);
        //nesse caso convertemos a variabel inteiro para short porem precisamos estar ciente que o short tem
        //limitações se comparados a variaveis do tipo inteiro

        //AO ULTRAPASSARMOS O ULTIMO VALOR PERMITIDO POR UM TIPO DE DADO O JAVA IRA RETORNAR PARA O PRIMEIRO NUMERO
        //POSSIVEL DO TIPO CONVERTIDO E CONTINUAR SOMANDO POR ISSO DEVEMOS TER EM MENTE O QUE REALMENTE PRECISAMOS
        //FAZER COM A CONVERSAO PARA NAO ULTRAPASSAR OS VALORES PERMITIDOS EM UM TIPO DE DADO


        //OPERADORES

        //OPERADORES DE COMPARAÇÃO

        /* ==  verifica se igual
           !=  verifica se diferente
           > maior que
           < menor que
           <= menor ou igual
           >= maior ou igual
        */

        //O TIPO CHAR

        /*
        todos os caracteres sao convertidos para numeros
        por isso podemos usar numeros em variaveis do tipo char
         */

        var nome = "timoteo";
        //concatenacao de variaveis de texto
        System.out.println(nome + " Santos");
        //ultilizando nosso novo tipo de dados Naipes que foi definido
        var valor =  Naipes.Paus;

        var valorNipes = "Ouro";
        //podemos fazer operacoes com valores ordinais
        Naipes naipes = Naipes.valueOf(valorNipes);
        System.out.println(valor.ordinal());
        System.out.println(naipes.name());

        //vetores e matrizes

        //criando um vetor

        int[] x2 = new int [] {10,2,-30,-5};

        var y2 = new  double[10];

        char [][] z;

        System.out.println(x2[1]);

    }

}