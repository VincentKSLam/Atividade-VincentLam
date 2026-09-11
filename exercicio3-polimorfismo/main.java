public class main {
    public static void main(String[] args) {
        calculadora calculator = new calculadora();

        int soma1 = calculator.somar(10, 20);
        int soma2 = calculator.somar(1, 2, 3);
        double soma3 = calculator.somar(2.5, 3.8);

        System.out.println(soma1);
        System.out.println(soma2);
        System.out.println(soma3);



    }
}