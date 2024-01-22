public class Exercise1 {
    public static void main(String[] args) {

        int numero = 12;

        if (numero < 0 && numero % 2 != 0) {
            System.out.println(numero + " é ímpar e negativo.");
        } else if (numero < 0 && numero % 2 == 0) {
            System.out.println(numero + " é par e negativo.");
        } else if (numero > 0 && numero % 2 != 0) {
            System.out.println(numero + " é ímpar e positivo.");
        } else if (numero > 0 && numero % 2 == 0) {
            System.out.println(numero + " é par e positivo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}
