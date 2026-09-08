public class cofrinho {
    private String objetivo;
    private double saldo; 

    public record ObjetivoSaldo(String objetivo, double saldo) {}

    public ObjetivoSaldo getObjetivoSaldo() {
        return new ObjetivoSaldo(this.objetivo, this.saldo);
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void retirar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Valor inválido para retirada.");
        }
    }
    
    public void MostrarSaldo(){
        System.out.println(saldo);
    }

    public void MeuObjetivo(){
        System.out.println(objetivo);
    }
}