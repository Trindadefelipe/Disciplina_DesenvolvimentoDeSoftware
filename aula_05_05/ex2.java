import java.util.ArrayList;

abstract class Pagamento{
    protected double valorAberto;

    public Pagamento(double valorAberto){
        this.valorAberto = valorAberto;
    }

    public double getValorAberto(){
        return valorAberto;
    }

    public abstract double processarPagamento();
}

class Cartao extends Pagamento{
    public Cartao(double valorAberto){
        super(valorAberto);
    }

    @Override
    public double processarPagamento(){
        return (valorAberto + (valorAberto * 0.05));
    }
}

class Pix extends Pagamento{
    public Pix(double valorAberto){
        super(valorAberto);
    }

    @Override
    public double processarPagamento(){
        return valorAberto;        
    }
}

class Boleto extends Pagamento{
    public Boleto(double valorAberto){
        super(valorAberto);
    }

    @Override
    public double processarPagamento(){
        return valorAberto + 2;         
    }
}

public class ex2 {
    public static void main(String[] args) {
        ArrayList <Pagamento> lista = new ArrayList<>();

        lista.add(new Cartao(100));
        lista.add(new Pix(700));
        lista.add(new Boleto(150));

        for (Pagamento p : lista){
            System.out.println(p.processarPagamento());
        }
    }
}
