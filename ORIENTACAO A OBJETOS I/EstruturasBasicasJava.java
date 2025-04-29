public class Main
{
    public static void main(String args[])
    {
        //fazendo type cast
        int idade = 20;
        String nome = "timoteo";

        //fazendo o typecast
        double idade2 = (double) idade;
        System.out.println(idade2);

        //String idade3 =  idade;

        //comandos de decisao
        if (idade == 18)
        {
            System.out.println("bem vindo voce pode dirigir " + idade);
        }else{
            System.out.println("a idade é menor que 18");
        }

        //break e continue
        for (int i = 0; i <= 10; i++)
        {
            int teste = i % 2;
            
            
            if (teste == 0) {
                
                System.out.println("valor é divisivel por dois " + i);
               //ao ultilizar break o algoritmo ira finalizar toda a operacao
            }

        }
        
        //estrutura while
        int numero = 0;
        while (numero <= 10)
        {
            System.out.println(numero);
            numero = numero + 2;
        }
        
        numero = 0;
        
        do {
            System.out.println(numero);
            numero++;
            
        }while(numero <= 10);
        
        
     switch(numero)
     {
         case 1:
             System.out.println("numero é um");
             break;
         case 2:
             System.out.println("numero é dois");
             break;
         case 11:
             System.out.println("nuemero é onze");
             break;
         default:
            System.out.println("o numero é " + numero);
     }
    
    
     
     
        
    }
}