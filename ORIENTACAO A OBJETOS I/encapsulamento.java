
//uma class abstrata nao pode ser instanciada apenas usada como um modelo
abstract class Pessoa {

    //nome é publico pode ser usada em qualquer classe do projeto
    public String nome = "timoteo";
    //apenas a classe consegue ver esse atributo
    private String senha = "az@3#";
    //a classe ou quem herde ela consegue ver esse atributo
    protected int telefone = 123456;
}

class Aluno extends  Pessoa {

    void imprimirSenha() {
        System.out.println(this.senha);
    }
}

class RepresentateSala extends Aluno{

    void Imprimirdados(){
        //todas as classes que herdam ou a propria classe conseguem acessar nome diretamente
        System.out.println(this.nome);
        //telefone apenas as classes que herdam a classe diretamente ou nao
        System.out.println(this.telefone);
        //porem senha so pode ser visto pela primeira classe que herdou a classe onde esta o atributo
    }

}

public class Main {

    public static void main(String[] args)
    {
        RepresentateSala rp = new RepresentateSala();
        rp.Imprimirdados();
        rp.imprimirSenha();

    }
}