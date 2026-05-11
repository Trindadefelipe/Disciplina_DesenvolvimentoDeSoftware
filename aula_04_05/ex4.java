class Pagamento {
    public void processarPagamento() {
        System.out.println("Qual a forma de pagamento?");
    }
}

class Cartão extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento Cartão selecionado! Débito ou Crédito?");
    }
}

class Pix extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento pix selecionado! Chave pix: xxx.xxx.xxx-xx");
    }
}

class Boleto extends Pagamento {
        @Override
    public void processarPagamento() {
        System.out.println("Pagamento boleto selecionado! Boleto gerado com vencimento para 20 dias!");
    }
}

public class ex4 {
    public static void main(String[] args) {
        Pagamento pagamento1 = new Cartão();
        Pagamento pagamento2 = new Pix();
        Pagamento pagamento3 = new Boleto();

        pagamento1.processarPagamento();
        pagamento2.processarPagamento();
        pagamento3.processarPagamento();
    }
}
