import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        String nome;
        String nomePai;
        String nomeMae;
        String verifica;
        int idade;
        Scanner sc = new Scanner(System.in); // leitura e processamento da entrada de dados

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do seu pai: ");
        nomePai = sc.nextLine();
        System.out.println("Digite o nome da sua mae: ");
        nomeMae = sc.nextLine();

        if (nome.length() > nomePai.length() || nome.length() > nomeMae.length() ){ // comparação do tamanho dos nomes
        verifica = "O nome do usuário é maior";
        } else {
        verifica = "O nome do usuário é menor";
        }

        System.out.println("Meu nome é: " + nome);
        System.out.println("Minha idade: " + idade);
        System.out.println("O nome do seu pai: " + nomePai);
        System.out.println("O nome da sua mae: " + nomeMae);
        System.out.println(verifica);
    }
}
