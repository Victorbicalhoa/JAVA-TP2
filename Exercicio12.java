import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        String[] palavra = frase.split("\\s+");
        int contador = 0;

        for (String s : palavra) {
            if (!s.isEmpty()){
                contador++;
            }
        }

        System.out.println("A frase contém " + contador + " palavras");
    }
}
