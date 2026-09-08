import java.util.Scanner;
public class Main {
Scanner input = new Scanner (System.in);
int N1;
int N2;
int N3;
int soma;
double media;
    System.out.println("Digite o primeiro número:");
    N1 = input.nextInt();
    System.out.println("Digite o segundo número:");
    N2 = input.nextInt();
    System.out.println("Digite o terceiro número:");
    N3 = input.nextInt();

    soma = N1+N2+N3;
    media = soma/3;
    System.out.println("A soma dos números é "+ ""+ soma + ""+ ""+ "e a média entre eles é "+ ""+ media);


}
