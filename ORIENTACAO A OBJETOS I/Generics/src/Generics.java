//perceba que ao criar a classe estamos passando um timpo T
public class Generics<T, Tquantidade> {
    //esse atributo recebe o tipo que veio da instancia
    private T value;
    //esse atributo recebe o tipo que veio da instancia da classe
    public Tquantidade quantidade;

    //perceba que os tipos dessa classe nao sao declarados eles vem da instancia da classe
    public Generics(T value, Tquantidade quantidade){
        this.value = value;
        this.quantidade = quantidade;
    }

    //esse metodo recebe um tipo generico que veio da classe
    public void add(T value)
    {
        this.value = value;
    }
    //esse metodo retorna um tipo que veio da instancia da classe
    public T getValue()
    {
        return  this.value;
    }

}

/* uma clsse generica é uma classe que recebe um tipo ao intanciar a classe
o que faz ser possivel ter uma classe com tipos dinamicos assim como outras linguagens que tem
tipagem dinamica no java se for nescessario ter tipos dinamicos podemos usar esse recurso,

PERCEBA QUE NAO ULTILIZAMOS EM MOMENTO ALGUM NESSA CLASSE OS TIPOS DOS ATRIBUOS NEM DOS RETORNOS DOS PARAMETROS
* */
