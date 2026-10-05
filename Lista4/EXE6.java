import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> tentativasFalhas = new ArrayList<Integer>();

        int numeroEscolhido;
        int totalTentativas = 0;
        int numeroAlvo = 32;

        do {

            System.out.println("Informe um número: ");
            numeroEscolhido = teclado.nextInt();

            totalTentativas++;

            if (numeroEscolhido < numeroAlvo) {

                tentativasFalhas.add(numeroEscolhido);
                System.out.println("Tente um número maior.");

            } else if (numeroEscolhido > numeroAlvo) {

                tentativasFalhas.add(numeroEscolhido);
                System.out.println("Tente um número menor.");
            }

        } while (numeroEscolhido != numeroAlvo);

        System.out.println("Você acertou o número secreto!");
        System.out.println("Total de tentativas: " + totalTentativas);

        System.out.println("Números que você errou:");

        for (int posicao = 0; posicao < tentativasFalhas.size(); posicao++) {

            System.out.println(tentativasFalhas.get(posicao));
        }
    }
}
