import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double salario;
        double aumento;
        double Satu;

        System.out.println("Escreva o salário atual:");
        salario = input.nextInt();
        aumento = salario * 10/100;
        System.out.println("O valor do aumento é de :" + " "+ aumento);
        Satu = salario + aumento;

        System.out.println("O salário reajustado é" + " " + Satu);
    }
}