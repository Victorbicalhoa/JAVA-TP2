import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100);
        int numero;

        do {
            System.out.println("Digite um número entre 0 e 100");
            numero = sc.nextInt();

            if (numeroAleatorio < numero) {
                System.out.println("O número escolhido é menor!");
            } else if (numeroAleatorio > numero) {
                System.out.println("O número escolhido é maior!");
            }
        }
        while (numero != numeroAleatorio);

        System.out.println("Número correto! " + numeroAleatorio);
    }
}
