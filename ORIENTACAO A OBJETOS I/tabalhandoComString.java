class Main {
    public static void main(String[] args)
    {
        //instanciando uma nova String
        String nome = "timoteo";
        
        //instanciando uma string de outra forma
        String sobreNome = new String("Timoteo");
        System.out.println(sobreNome);
      
        //atribuindo a quantidade de caracteres a uma variavel
        int quantidadeDeCaracteres = nome.length();
        //escrevendo a quantidade de caracteres de uma string
        System.out.println(quantidadeDeCaracteres);
        
        //ao inves de atribuir aqui estamos apenas escrevendo a quantidade de caracteres
        System.out.println(sobreNome.length());
        
        //testando se uma string é igual a outra
        //porem se as letras forem minusculas ou maiusculas
        //havera diferenca
        if(nome.equals(sobreNome))
        {
           System.out.println("sao iguais");
        }else{
            System.out.println("sao diferentes");
        }
        
        //se for nescessario que as letras sejam comparadas 
        //ignorando letras maiusculas e minusculas 
        //deveremos ultilizar o metodo equalsIgnoreCase
        if(nome.equalsIgnoreCase(sobreNome))
        {
            System.out.println("sao iguais");
        }else{
            System.out.println("nao sao iguais");
        }
        //concatenando strings
        String concatenado = nome +  " " + sobreNome;
        System.out.println(concatenado);
        
        //usando o operador de concatenação
        String nomeCompleto = nome.concat(" " + sobreNome);
        System.out.println(nomeCompleto);
        
        //criando uma variavel tipo inteiro
        int cpf = 953;
        //convertendo para string
        String cpfString = String.valueOf(cpf);
        //escrevendo a string
        System.out.println(cpfString);
    }
}
