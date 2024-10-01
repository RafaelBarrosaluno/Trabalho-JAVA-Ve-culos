public class Main {

    // Método estático
    public static void exibirInfoVeiculo(Veiculo veiculo) {
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        veiculo.acelerar();
        veiculo.buzinar();
    }

    public static void main(String[] args) {
        // Criando objetos das subclasses
        Caminhao meuCaminhao = new Caminhao("Scania", 2029, 8, "GG");
        Barco meuBarco = new Barco("Beneteau", 2026, false, 99);

        // Chamando o método estático
        exibirInfoVeiculo(meuCaminhao);
        System.out.println();
        exibirInfoVeiculo(meuBarco);
    }
}