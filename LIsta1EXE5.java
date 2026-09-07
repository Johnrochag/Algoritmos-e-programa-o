import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double altura;
        double peso;
        double IMC;
        System.out.println("Digite seu peso em Kg: ");
        peso =  input.nextDouble();
        System.out.println("Digite sua altura em metros:" );
        altura = input.nextDouble();

        IMC = peso/altura * altura;
        System.out.println("O IMC calculado foi:"+ " "+ IMC);
    }
}
