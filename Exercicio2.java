import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        double media;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextInt();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextInt();
        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        if (media >= 7) {
            System.out.println("aluno aprovado! Nota final: " + media);
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em recuperação! Nota final: " + media);
        } else {
            System.out.println("Aluno reprovado! Nota final: " + media);
        }

    }
}
