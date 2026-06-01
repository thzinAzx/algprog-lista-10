public class Computador {
    String processador;
    int memoriaRAM;
    int armazenamento;
    String sistemaOperacional;

    public Computador(String processador, int memoriaRAM, int armazenamento, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ligar() {
        System.out.println("Computador ligado.");
    }

    public void desligar() {
        System.out.println("Computador desligado.");
    }

    public void executarPrograma() {
        System.out.println("Programa executando.");
    }

    public void reiniciar() {
        System.out.println("Computador reiniciando.");
    }
}