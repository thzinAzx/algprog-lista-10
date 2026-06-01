public class Carro {
    String marca;
    String modelo;
    String cor;
    int ano;

    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("Carro ligado.");
    }

    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    public void frear() {
        System.out.println("Carro freando.");
    }

    public void buzinar() {
        System.out.println("Biiii!");
    }
}