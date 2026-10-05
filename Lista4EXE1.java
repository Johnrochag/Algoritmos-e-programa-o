import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fatorial = 1;
        int numero;


        System.out.println("Olá. Digite o número que deseja saber o fatorial:");
        numero = input.nextInt();

        for (int i = numero; i  >= 1; i--) {
            fatorial = fatorial * i;
            System.out.println("Fatorial de " + numero + " = " + fatorial);



        }
    }
}