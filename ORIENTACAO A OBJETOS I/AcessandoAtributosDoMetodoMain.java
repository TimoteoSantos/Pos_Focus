public class Main {
    
    //um atributo publico da classe Main
    public int senha = 90;
    
    //um atributo publico estatico da classe Main
    public static int idade = 10;
    
    // metodo principal da classe main ele inicia a aplicação em java
    public static void main(String[] args) {
    
    /* nao é possivel acessar atributos nem metodos da classe main
    //diretamente para isso precisamos criar um objeto */
    
    /*estamos criando um objeto da propria classe
    Main para que possamos manipular
    seus metodos e atributos */
    
    Main main = new Main();
    
    // acessando o atributo senha do Main
    System.out.println(main.senha);
    
    /*aqui eu acesso um atributo statico
    para isso eu nao preciso de um objeto */
    
    System.out.println(Main.idade);
    
    }
}