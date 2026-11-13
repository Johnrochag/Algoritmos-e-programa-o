import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CADASTRO DE MOTO ===");

        System.out.print("Digite a marca: ");
        String marca = entrada.nextLine();

        System.out.print("Digite o modelo: ");
        String modelo = entrada.nextLine();

        System.out.print("Digite o ano: ");
        int ano = entrada.nextInt();

        System.out.print("Digite as cilindradas: ");
        int cilindradas = entrada.nextInt();

      
        Moto minhaMoto = new Moto(marca, modelo, ano, cilindradas);

        minhaMoto.exibirDados();
        minhaMoto.ligar();
        minhaMoto.exibirDados();
        minhaMoto.desligar();

        entrada.close();
    }
}
