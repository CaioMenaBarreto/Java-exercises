public class Exercise2 {
    public static void main(String[] args) {
        int tamanho = 10; // Altere este valor para o tamanho desejado da sequência

        // Chama o método para imprimir a sequência de Fibonacci
        imprimirSequenciaFibonacci(tamanho);
    }

    // Método para imprimir a sequência de Fibonacci
    public static void imprimirSequenciaFibonacci(int tamanho) {
        int primeiroTermo = 0, segundoTermo = 1;

        System.out.println("Sequência de Fibonacci de tamanho " + tamanho + ":");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
