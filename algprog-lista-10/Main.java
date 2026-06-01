public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(
                "Thiago",
                17,
                "123.456.789-00",
                "thiago@email.com"
        );

        Carro carro = new Carro(
                "Toyota",
                "Corolla",
                "Prata",
                2024
        );

        Celular celular = new Celular(
                "Samsung",
                "Galaxy S24",
                256,
                100
        );

        Computador computador = new Computador(
                "Intel i7",
                16,
                512,
                "Windows 11"
        );

        pessoa.falar();
        carro.acelerar();
        celular.tirarFoto();
        computador.executarPrograma();
    }
}