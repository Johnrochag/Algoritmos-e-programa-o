import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int maior;

        System.out.println("Informe o primeiro valor:");
            n1 = input.nextInt();
        System.out.println("Informe o segundo valor:");
            n2 = input.nextInt();
        System.out.println("Informe o terceiro valor:");
            n3 = input.nextInt();
        if ( n1 >= n2 && n1 >= n3) {
            maior = n1;
            System.out.println("O maior número é" + " " + n1);
        }else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
            System.out.println("O maior número é" + " " + n2);
        }else{
            System.out.println("O maior número é" + " " + n3);



        }
    }
}