package formas;
import suplementos.Cor;

public class Forma {
    private Cor cor;

    public Forma(Cor cor) {
        this.cor = cor;
    }
    public Cor getCor() {
        return this.cor;
    }

    public double getArea(){
        return 0;
    }
    public double getPerimetro(){
     return  0;
    }
}