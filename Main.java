import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cel;
        double conta;
        int resp;


        System.out.println("Digite a temperatura em Celsius:");
            cel = input.nextInt();
        System.out.println("Para qual unidade você deseja converter?");
        System.out.println("[1] Fahrenheit");
        System.out.println("[2] Kelvin");
            resp = input.nextInt();

        if (resp == 1) {
            conta = cel * 1.8 + 32;
            System.out.printf("Temperatura convertida: %.2f%n", conta);

        }else if (resp == 2) {
            conta = cel + 273.15;
            System.out.printf("Temperatura convertida: %.2f%n", conta);

        }else{
            System.out.println("Resposta inválida");

        }
    }
}