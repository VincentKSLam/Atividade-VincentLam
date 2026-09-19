public class desenvolvedor extends funcionario{
        public desenvolvedor(String nome, double salario) {
    super(nome, salario);
    }

    @Override
    public void calcularbonus(){
        return getsalario()*0.1;
    }

}