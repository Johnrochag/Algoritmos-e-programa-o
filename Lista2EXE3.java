import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N1;
        double conta;

        System.out.println("Digite um valor:");
            N1 = input.nextInt();

            if (N1 % 2==0) {
                conta = N1 * N1;
                System.out.printf("Seu número é par, e seu quadrado é igual a: %.2f%n", conta);



            }else{
                conta = N1 * N1 * N1;
                System.out.printf("Seu número é impar, e seu cubo é igual a: %.2f%n", conta);






        }

    }
}
