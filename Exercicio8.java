import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triangulo: ");
        double primeiro = sc.nextDouble();
        System.out.println("Digite o segundo lado do triangulo: ");
        double segundo = sc.nextDouble();
        System.out.println("Digite o terceiro lado do triangulo: ");
        double terceiro = sc.nextDouble();

        if (primeiro == segundo && segundo == terceiro) {
            System.out.println("O triângulo é equilátero.");
        } else if (primeiro == segundo || segundo == terceiro || primeiro == terceiro) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }
        sc.close();
    }
}
