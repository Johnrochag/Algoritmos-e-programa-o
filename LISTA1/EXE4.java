import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double valor;
        double por;
        double novo;
        System.out.println("Digite o valor do produto: ");
        valor = input.nextInt();
        por = valor * 10/100;
        novo = valor - por;

        System.out.println("O produto com 10% de desconto é" + " " + novo);

    }
}
