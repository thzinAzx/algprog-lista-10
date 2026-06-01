public class Celular {
    String marca;
    String modelo;
    int armazenamento;
    int bateria;

    public Celular(String marca, String modelo, int armazenamento, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.bateria = bateria;
    }

    public void ligar() {
        System.out.println("Celular ligado.");
    }

    public void enviarMensagem() {
        System.out.println("Mensagem enviada.");
    }

    public void tirarFoto() {
        System.out.println("Foto tirada.");
    }

    public void carregar() {
        System.out.println("Carregando bateria.");
    }
}