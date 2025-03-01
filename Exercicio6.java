import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();
        boolean bissexto = verifica(ano);

        if (bissexto) {
            System.out.println(ano + " É um ano bissexto");
        } else {
            System.out.println(ano + " Não é um ano bissexto");
        }
    }

    public static boolean verifica(int ano) {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
