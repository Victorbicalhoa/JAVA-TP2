import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double valor;
        double dolar;
        double euro;
        double libra;
        String moeda;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em reais: ");
        valor = sc.nextDouble();
        System.out.println("Digite a moeda (dolar, euro ou libra): ");
        moeda = sc.next().toLowerCase();

        switch (moeda) {
            case "dolar":
                dolar = valor * 5.9;
                System.out.println("Valor convertido em dolares: " + dolar);
            break;
            case "euro":
                euro = valor * 6.2;
                System.out.println("Valor convertido em euros: " + euro);
                break;
            case "libra":
                libra = valor * 7.25;
                System.out.println("Valor convertido em libras: " + libra);
                break;
                default:
                    System.out.println("Moeda inválida! (dolar, euro ou libra)");

        }
    }
}
