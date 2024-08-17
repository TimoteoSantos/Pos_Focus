//um pacote onde estao as formas
package formas;

import suplementos.Cor;

//classe que representa um retangulo
public class Retangulo extends Forma {
    public  double lado1;
    public double lado2;
    //um atributo do tipo cor que é um tipo de dado enum


    //metodo construtor de um retangulo
    public Retangulo(double lado1, double lado2, Cor cor) {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //metodos getters perceba que nao tem metodos setters o que signfica que so é possivel atribuir valores ao instanciar uma classe
    public double getLado1() {
        return  this.lado1;
    }

    public double getLado2(){
        return  this.lado2;
    }
    public double isQuadrado() {
        return lado1 = lado2;
    }
    /* polimorfismo é quando um metodo é sobrecrito isso pode acontecer na mesma classe ou em outra classe
    quando acontece na mesma classe é chamdo de sobrecarga de metodos isso porque teremos um mesmo metodo com
    tipos e ou quantidade de argumentos ou retorno diferentes, ja quanoo isso acontece em outra classe chamamos de
    sobreposicao pois ele tera a mesma assinatura ou seja a quantidade tipo de argumentos, o tipo do retorno precisam
    ser guais outra coisa é que podemos por boa pratica precisamos usar a anotação @overide para identificar os metodos que
    sao polimorfismo pois o compilador ira procurar por esse metodo na superclasse e gerara um erro cado nao tena
    * */

    @Override //indicando que este metodo foi sobreposto pois existe um metodo na classe mae igual esse com mesmo nome e assinatura
    public double getArea() {
        return  lado1 * lado2;
    }
    @Override
    public double getPerimetro(){
        return 2 * (lado1 + lado2);
    }

}
