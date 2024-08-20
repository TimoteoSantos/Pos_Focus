package interfaces;
import suplementos.Cor;

/*criando uma interface.
    nao pode conter atributos
    todos os metodos sao publicos
    todos os metodos sa abstratos
    uma mesma classe pode implementar varias interfaces
 */

public interface colorivel {
    //perceba que o metodo é publico e abstrato por padrao sendo desnessesario a informação de tal
    Cor getCor(); //todo metodo de uma interface e abstrato e publico por padrao, a classe que implementar quem criara seu comportamento
}