public class Veiculo {
    private String modelo;
    private int ano;

    // Construtor
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos Getter e Setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método a ser sobrescrito
    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }
    public void buzinar() {
        System.out.println("O veículo consegue buzinar.");
    }
}