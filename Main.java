import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("Qual a sua idade?");
        idade = input.nextInt();
        if (idade >= 7 && idade <= 12) {
            System.out.println("infantil");

        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Juvenil");

        }else{
            System.out.println("Adulto");
        }


        }
    }