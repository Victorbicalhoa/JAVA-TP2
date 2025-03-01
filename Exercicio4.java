import java.time.LocalDate; // trabalha com datas
import java.time.temporal.ChronoUnit; // calcula a diferença entre datas
import java.util.Scanner; // captura a entrada do usuario

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // captura a entrada do usuario
        System.out.println("Digite o ano de nascimento: ");
        int ano = sc.nextInt();
        System.out.println("Digite o mes de nascimento: ");
        int mes = sc.nextInt();
        System.out.println("Digite o dia de nascimento: ");
        int dia = sc.nextInt();

        LocalDate now = LocalDate.now(); // obtém a data atual
        LocalDate nascimento = LocalDate.of(ano, mes, dia); // cria um objeto com a data de nascimento do usuario
        long idade = ChronoUnit.DAYS.between(nascimento, now); // calcula a quantidade de dias

        System.out.println("Idade em dias: " + idade + " dias");
    }
}
