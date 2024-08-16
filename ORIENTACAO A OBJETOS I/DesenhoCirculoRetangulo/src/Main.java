
import formas.Forma;
import suplementos.Cor;
import formas.Retangulo;
import formas.Circulo;

public class Main {

    //observe que estamos usando os atributos da classe Main()
    private Forma[] formas = {
            new Retangulo(2,5, Cor.Preto),
            new Retangulo(3,1,Cor.Branco),
            new Circulo(4,Cor.Azul),
            new Circulo(5,Cor.Verde)
    };//final do vetor

//ese e um metodo que retorna a escrita de uma forma ele recebe um argumento chamado de f que tem como tipo uma forma
    private void imprimir(Forma f) {
        //escreve os dados dos gets da forma recebida observar que os gets vem da forma ou de outra classe por polimorfismo
        System.out.printf("Cor: %8s Area: %5.2f Perimetro %5.2f \n" ,f.getCor() ,f.getArea() ,f.getPerimetro());
    }
    public void run() {
        //metodo que faz um for nas formas contidas num array
        for(Forma f: formas) {
            //a cada laco chama o metodo imprimir que recebe a forma a ser impressa o metodo imprimir implementa a impressao dos dados
            imprimir(f);
        }
    }

    //classe principal do programa
    public static void main(String[] args){
        //instanciando a propria main porque precisamos chamar seu metodo run()
        Main m = new Main();
        //metodo que percorre todas as formas
        m.run();

    }
}