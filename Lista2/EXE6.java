import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int produto;
        int preco;
        int quantidade;
        double conta;
        double desconto;
        System.out.println("Olá, seja bem-vindo!");
        System.out.println("Informe o código do produto desejado:");
        produto = input.nextInt();


        if (produto >= 1 && produto <= 10) {
            preco = 10;
            System.out.println("Informe a quantidade de itens:");
            quantidade = input.nextInt();
            conta = quantidade * preco;
            System.out.printf("O valor total é igual a: %.2f%n", conta);

            if (conta >= 1 && conta <= 250) {
                System.out.println("Você ganhou 5% de desconto na sua compra e o valor total será de:");
                desconto = conta * 0.05;
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");

            } else if ((conta >= 250 && conta <= 500)) {
                System.out.println("Você ganhou 10% de desconto na sua compra e o valor total será de:");
                desconto = conta * 0.10;
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");
            } else {
                desconto = conta * 0.15;
                System.out.println("Você ganhou 15% de desconto na sua compra e o valor total será de:");
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");
            }


        } else if (produto >= 11 && produto <= 20) {
            preco = 15;
            System.out.println("Informe a quantidade:");
            quantidade = input.nextInt();
            conta = quantidade * preco;
            System.out.printf("O valor total é igual a: %.2f%n", conta);

            if (conta >= 1 && conta <= 250) {
                System.out.println("Você ganhou 5% de desconto na sua compra e o valor total será de:");
                desconto = conta * 0.05;
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");

            } else if ((conta >= 250 && conta <= 500)) {
                System.out.println("Você ganhou 10% de desconto na sua compra e o valor total será de:");
                desconto = conta * 0.10;
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");
            } else {
                desconto = conta * 0.15;
                System.out.println("Você ganhou 15% de desconto na sua compra e o valor total será de:");
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");
            }


        }else if (produto >= 21 && produto <= 30) {
            preco = 20;
            System.out.println("Informe a quantidade:");
            quantidade = input.nextInt();
            conta = quantidade * preco;
            System.out.printf("O valor total é igual a: %.2f%n", conta);
            if (conta >= 1 && conta <= 250) {
                System.out.println("Você ganhou 5% de desconto na sua compra e o valor total será de:");
                desconto = conta * 0.05;
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");

            } else if ((conta >= 250 && conta <= 500)) {
                System.out.println("Você ganhou 10% de desconto na sua compra e o valor total será de:");
                desconto = conta * 0.10;
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");
            } else {
                desconto = conta * 0.15;
                System.out.println("Você ganhou 15% de desconto na sua compra e o valor total será de:");
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");
            }


        }else if (produto >= 31 && produto <= 40) {
                        preco = 30;
                        System.out.println("Informe a quantidade:");
                        quantidade = input.nextInt();
                        conta = quantidade * preco;
                        System.out.printf("O valor total é igual a: %.2f%n", conta);

            if (conta >= 1 && conta <= 250) {
                System.out.println("Você ganhou 5% de desconto na sua compra e o valor total será de:");
                desconto = conta * 0.05;
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");

            } else if ((conta >= 250 && conta <= 500)) {
                System.out.println("Você ganhou 10% de desconto na sua compra e o valor total será de:");
                desconto = conta * 0.10;
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");
            } else {
                desconto = conta * 0.15;
                System.out.println("Você ganhou 15% de desconto na sua compra e o valor total será de:");
                conta = conta - desconto;
                System.out.printf("%.2f%n" , conta);
                System.out.println("Obrigado pela preferência. Volte sempre :)");
            }
                    }
                }
            }


