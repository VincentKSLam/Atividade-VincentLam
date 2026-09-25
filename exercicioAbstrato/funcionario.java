public abstract class funcionario{
    private String nome;
    private double salario;

    public funcionario(String nome, double salario){
        this.nome=nome;
        this.salario=salario;
    }
    public String getnome(){
        return nome;
    }
    public double getsalario(){
        return salario;
    }
    public void mostrardados(){
        System.out.println("Nome:" + nome);
        System.out.println("Salario:" + salario);
    }
    public abstract double calcularbonus();
}