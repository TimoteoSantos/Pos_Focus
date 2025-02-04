package formas;
import interfaces.Poligono;
import interfaces.colorivel;
import suplementos.Cor;

//classes abstratas nao podem ser instanciadas por new, tem metodos publicos abstratos
//a diferenca entre classe abstrata e interface é que uma classe pode herdar apenas
//uma classe abstrata mas pode implentar varias interfaces

//classe abstrata
public abstract class Forma implements colorivel, Poligono {
    //metodo privado cor
    private Cor cor;

    //construtor da classe
    public Forma(Cor cor) {
        this.cor = cor;
    }
    //metodo de acesso ao atributo cor perceba que essa classe nao tem metodo set ou seja
    //so é possivel criar uma cor na instanciação do objeto
    public Cor getCor() {
        return this.cor;
    }
}