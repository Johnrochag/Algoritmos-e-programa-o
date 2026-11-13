public class Moto {

    private String marca;
    private String modelo;
    private int ano;
    private int cilindradas;
    private boolean ligada;


    public Moto(String marca, String modelo, int ano, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cilindradas = cilindradas;
        this.ligada = false;
    }


    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("A moto foi ligada!");
        } else {
            System.out.println("A moto já está ligada.");
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("A moto foi desligada!");
        } else {
            System.out.println("A moto já está desligada.");
        }
    }

    public void exibirDados() {
        System.out.println("\n--- DADOS DA MOTO ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cilindradas: " + cilindradas + " cc");

        if (ligada) {
            System.out.println("Situação: Ligada");
        } else {
            System.out.println("Situação: Desligada");
        }
    }
}
