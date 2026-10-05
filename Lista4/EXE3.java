import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0;
        int[] diasSemana = new int[5];
        double tempT = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Olá, digite a temperatura do dia " + (i+1));
            diasSemana[i] = input.nextInt();
            tempT += diasSemana[i];

        }

        media = (tempT / 5);
        System.out.println("Média de temperatura da semana: " + media);
        System.out.println("Dias em que as temperaturas ficaram elevadas:");


        for (int i = 0; i < 5; i++) {
        if ( diasSemana[i] > media ) {


            System.out.println("Dia " + (i+1) + "=" + diasSemana[i]);


            }
        }
    }
}
