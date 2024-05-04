
//uma classe livro 
class Livro {
    private String nome;
    private int paginas;
    private String autor;

    public Livro(String nome, int paginas, String autor) {
        this.nome = nome;
        this.paginas = paginas;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }
    
}

//classe principal do programa
public class Main {
    
    public static void main(String[] args) {
        /* uma instacia da classe livro que na verdade é uma variavel
        do tipo Livro que receve um novo objeto do tipo livro
        com suas caracteristicas e comportamentos
        */
        Livro Livro = new Livro("Timoteo", 10, "Timoteo");
        //acessando um comportamento do objeto livro o de retornar uma caracteristica
        System.out.println(Livro.getNome());        
    }
}