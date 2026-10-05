import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] pesosCaixas = new double[6];
        double pesoProcurado;
        int quantidadeEncontrada = 0;
        int continuar;

        do {

            quantidadeEncontrada = 0;

            for (int i = 0; i < 6; i++) {

                System.out.println("Digite o peso da caixa " + (i + 1) + ":");
                pesosCaixas[i] = input.nextDouble();

            }

            System.out.println("Digite o peso de preferência:");
            pesoProcurado = input.nextDouble();

            for (int i = 0; i < 6; i++) {

                if (pesoProcurado == pesosCaixas[i]) {
                    quantidadeEncontrada++;
                }

            }

            if (quantidadeEncontrada == 0) {

                System.out.println("Valor não localizado na amostragem.");

            } else {

                System.out.println(
                        "Valor " + pesoProcurado +
                                " encontrado " + quantidadeEncontrada + " vezes."
                );
            }

            System.out.println("Quer continuar? [1] Sim [2] Não");
            continuar = input.nextInt();

        } while (continuar == 1);

        if (continuar == 2) {
            System.out.println("OBRIGADO PELA PREFERÊNCIA!");
        }
    }
}
