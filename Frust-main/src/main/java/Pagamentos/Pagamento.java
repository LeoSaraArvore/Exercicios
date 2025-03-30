package Pagamentos;

public class  Pagamento {
    public void realizarPagamento() {
        System.out.println("Processando pagamento...");
    }
}

class PagamentoCartao extends Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com cartão aprovado!");
    }
}

class PagamentoDinheiro extends Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento em dinheiro recebido!");
    }
}
