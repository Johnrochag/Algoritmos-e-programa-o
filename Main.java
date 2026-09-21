import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resp;
        System.out.println("Olá. Bem vindo a tabuada digital");
        System.out.println("Digite o número que deseja saber a tabuada de multuplicão");
        resp = input.nextInt();
        for (int i =1; i <=10; i++) {
            System.out.println( resp + " x " + i + " = " + (resp * i));


        }
    }
}