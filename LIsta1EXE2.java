import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n1;
        int n2;
        int n3;
        int conta;
        double media;
        System.out.println("Digite o primeiro número:");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = input.nextInt();
        System.out.println("Digite o terceiro número:");
        n3 = input.nextInt();

        conta = n1+n2+n3;
        media = conta /3;
        System.out.println("A conta dos números é "+ ""+ conta + ""+ ""+ "e a média entre eles é "+ ""+ media);


    }

    }
