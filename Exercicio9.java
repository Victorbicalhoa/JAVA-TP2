import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = sc.nextLine();
        String novaSenha;

        do {
            System.out.println("Digite sua senha: ");
            novaSenha = sc.nextLine();
        } while (!senha.equals(novaSenha));
        sc.close();

        System.out.println("Senha correta! " + senha);
    }
}
