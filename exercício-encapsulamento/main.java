public class main {
    public static void main(String[] args) {
        cofrinho cofrasso = new cofrinho();
        cofrasso.setSaldo(0);
        cofrasso.setObjetivo("sei lá");
        
        cofrinho.ObjetivoSaldo dado = cofrasso.getObjetivoSaldo();

        
        System.out.println("Saldo:");
        cofrasso.MostrarSaldo();

        System.out.println("Objetivo:");
        cofrasso.MeuObjetivo();

        cofrasso.depositar(500);

        cofrasso.depositar(200);

        cofrasso.retirar(1000);

        cofrasso.depositar(-100);

        System.out.println("Saldo:"); 
        cofrasso.MostrarSaldo();
    }
}