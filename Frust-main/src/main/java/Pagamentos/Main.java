package Pagamentos;

public class Main {
    public static void main(String[] args) {
        // Criando um vetor de Pagamento
        Pagamento[] pagamentos = new Pagamento[2];

        // Adicionando diferentes tipos de pagamento ao vetor
        pagamentos[0] = new PagamentoCartao();  // Pagamento com cartão
        pagamentos[1] = new PagamentoDinheiro(); // Pagamento em dinheiro

        // Laço para chamar o método realizarPagamento() de cada objeto
        for (Pagamento pagamento : pagamentos) {
            pagamento.realizarPagamento();
        }
    }
}