import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();
        double valorFinal;

        if(valor>1000){
            valorFinal = valor*0.9;
            System.out.println("Desconto de 10%. Valor da compra: " + valorFinal + " R$");
        } else if(valor>=500 && valor<=1000){
            valorFinal = valor*0.95;
            System.out.println("Desconto de 5%. Valor da compra: " + valorFinal + " R$");
        }   else {
            valorFinal = valor;
            System.out.println("Sem desconto. Valor da compra: " + valorFinal + " R$");
        }

    }
}
