public class main {
    public static void main(String[] args) {
        Pagamento pagamentoPix = new PagamentoPix(100);
    
        Pagamento pagamentoCartao = new PagamentoCartao(100, 3);
    
    pagamentoPix.processar();
    System.out.println();
    pagamentoCartao.processar();
    }
}