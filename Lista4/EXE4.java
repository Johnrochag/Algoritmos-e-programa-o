import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaD =0;
        int [] diaS = new int[5];
        double faturamentoD =0;



        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor de vendas no dia " + (i+1));
            diaS[i] = input.nextInt();
            faturamentoD += diaS[i];
            mediaD = mediaD + diaS[i] /5;
        }

        System.out.println("O faturamento total do dia foi de: " + ( faturamentoD));
        System.out.println(" A média diária foi de: " + ( mediaD));


        for (int i = 0; i < 5; i++) {
            if (diaS[i] < mediaD) {
                System.out.println("Dia " + (i + 1) + " ficou abaixo da média com R$ " + diaS[i]);
            }

        }



    }
}
