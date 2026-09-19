public class gerente extends funcionario{
    public gerente(String nome, double salario) {
    super(nome, salario);
    }

    @Override
    public void calcularbonus(){
        return getsalario()*0.2;
    }

}