//classe abstrata cliente nao pode ser instaciada
class Cliente {
    //codigo do cliente
    public long codCliente;
    //construtor da classe
    Cliente(long codCliente){
        this.codCliente = codCliente;
    }
}

class Venda
{
    public double valor;
    public long cod;

    Venda(double valor, long cod, long codCliente) {
        
        //Cliente Cliente = new Cliente(codCliente);
        this.valor = valor;
        this.cod = cod;
    }
    
    public void Vender(){
        System.out.println(this.cod);
        System.out.println(this.valor);
    }
}

public class Main{
    public static void main(String[] args)
    {
        Venda venda = new Venda(10.00,10,1);
        venda.Vender();
    }
}