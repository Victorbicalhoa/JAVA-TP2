import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor inicial: ");
        int valorInicial = sc.nextInt();
        System.out.println("Valor do incremento: ");
        int valorIncremento = sc.nextInt();

        StringBuilder sequencia = new StringBuilder();

        while (valorInicial <= 100) {
            // Adiciona o número à sequência
            if (sequencia.length() > 0) {
                sequencia.append(", "); // Adiciona vírgula e espaço entre os números
            }
            sequencia.append(valorInicial);

            valorInicial += valorIncremento;
        }

        // Exibe a sequência
        System.out.println("Sequência: " + sequencia.toString());

        sc.close();
    }
}