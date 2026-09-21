import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int senha = 2026;
        int resp;
        String user;
        int reps = 0;

        System.out.println("Seja bem-vindo!");
        System.out.println("Informe o nome de usuário:");
        user = input.nextLine();

        System.out.println("Digite sua senha para prosseguir (SOMENTE NÚMEROS):");
        resp = input.nextInt();

        while (senha != resp) {

            reps++;

            System.out.println("SENHA INCORRETA, TENTE NOVAMENTE:");
            resp = input.nextInt();

        }


            System.out.println("Seja bem-vindo, " + user);
            System.out.println("Número de tentativas:" + " " + reps);



        }
    }
