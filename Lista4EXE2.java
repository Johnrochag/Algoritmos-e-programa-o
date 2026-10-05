import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salario;
        double salariomin;
        double salarioTotal = 0;
        int filhos;
        int filhosTotal = 0;
        int filhosphab = 0;
        int resposta;
        int habTo = 0;
        double mediaSA = 0;
        int mediaFI = 0;
        double salariHab = 0;
        double salarioQtdAbaixoMinimo = 0;
        double salariopercabaixomin;
        double maiorS = Double.MIN_VALUE;

        System.out.println("Digite o valor do salário mínimo:");
        salariomin = input.nextDouble();

        do {
            System.out.println("Digite o seu salário:");
            salario = input.nextDouble();
            if (maiorS < salariHab) {
                maiorS = salariHab;
            }
            if (salariHab < salariomin) {
                salarioQtdAbaixoMinimo++;
            }
            salarioTotal = +salariHab;

            System.out.println("Digite a quantidade de filhos:");
            filhos = input.nextInt();

            filhos += filhosTotal;
            filhosTotal += filhosphab;
            habTo++;

            System.out.println("Deseja continuar? S/N");
            System.out.println("[1] Sim  [2] Não");
            resposta = input.nextInt();
        }
        while (resposta != 2);
        {
            mediaSA = salarioTotal / habTo;
            mediaFI = filhosTotal / habTo;
            salariopercabaixomin = salarioQtdAbaixoMinimo / habTo;
            System.out.println("Salário médio da população: " + mediaSA);
            System.out.println("Número médio de filhos: " + mediaFI);
            System.out.printf("Maior salário R$ %.2f\n", maiorS);
            System.out.printf("Percentual de pessoas com salário abaixo do mínimo: %.2f", salariopercabaixomin);
        }
    }
}