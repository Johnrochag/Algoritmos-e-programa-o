import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valorR;
        double valorPM;
        double conta;

        System.out.println("Olá, qual o valor da sua renda mensal?");
        valorR = input.nextDouble();

        System.out.println("Qual o valor da prestação mensal que você deseja pagar no financiamento?");
        valorPM = input.nextDouble();

        conta = valorR * 0.30;

        if (valorPM <= conta) {

            if (valorPM > 3000 && valorR < 10000) {
                System.out.println("Financiamento negado por baixa renda");
            } else {
                System.out.println("Financiamento aprovado");
            }

        } else {
            System.out.println("Financiamento negado por alta prestação");
        }
    }
}