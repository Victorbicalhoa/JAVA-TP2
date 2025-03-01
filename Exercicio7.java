import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário bruto anual: ");
        double salario = sc.nextDouble();
        double salarioLiquido;
        double imposto;

        if (salario < 27870){
            salarioLiquido = salario;
            imposto = salario - salarioLiquido;
            System.out.println("Isento de imposto de renda, salário líquido: " + salarioLiquido + " R$. Imposto: " + imposto);
        } else if (salario >= 27870 && salario <= 37751){
            salarioLiquido = salario * 0.925;
            imposto = salario - salarioLiquido;
            System.out.println("Alíquota: 7,5%. Salário líquido: " + salarioLiquido + " R$. Imposto: " + imposto);
        } else if (salario >= 37751 && salario <= 50148){
            salarioLiquido = salario * 0.85;
            imposto = salario - salarioLiquido;
            System.out.println("Alíquota: 15%. Sálario lìquido: " + salarioLiquido + " R$. Imposto: " + imposto);
        } else if (salario >= 50148 && salario <= 64259) {
            salarioLiquido = salario * 0.775;
            imposto = salario - salarioLiquido;
            System.out.println("Alíquota: 22,5%. Salário líquido: " + salarioLiquido + " R$. Imposto: " + imposto);
        } else {
            salarioLiquido = salario * 0.725;
            imposto = salario - salarioLiquido;
            System.out.println("Alíquota: 27,5%. Salário líquido: " + salarioLiquido + " R$. Imposto: " + imposto);
        }
    }
}
