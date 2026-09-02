import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kWh;
        double conta;

        System.out.println("Qual o valor de kWh consumido?");
        kWh = input.nextInt();
        if (kWh >= 0 && kWh <= 100) {
            conta = kWh * 0.50;
            System.out.printf("O valor de kWh está 0,50 por kWh. O valor total da sua conta será: R$ %.2f%n", conta);

        } else if (kWh >= 101 && kWh <= 200) {
            conta = kWh * 0.70;
            System.out.printf("O valor de kWh está 0,70 por kWh. O valor total da sua conta será: R$ %.2f%n", conta);

        }else{
            conta = kWh * 0.90;
            System.out.printf("O valor de kWh está 0,90 por kWh. O valor total da sua conta será: R$ %.2f%n", conta);

        }


    }
}