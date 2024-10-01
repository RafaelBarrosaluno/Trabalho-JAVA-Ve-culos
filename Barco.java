public class Moto extends Veiculo {
    private boolean temCarroSide;
    private int velocidade;

    // Construtor
    public Moto(String modelo, int ano, boolean temCarroSide, int velocidade) {
        super(modelo, ano);  // Chama o construtor da superclasse
        this.temCarroSide = temCarroSide;
        this.velocidade = velocidade;
    }

    // Sobrescrevendo o método acelerar
    @Override
    public void acelerar() {
        System.out.println("O barco está acelerando.");
    }

    // Getter e Setter
    public boolean getTemCarroSide() {
        return temCarroSide;
    }

    public void setTemCarroSide(boolean temCarroSide) {
        this.temCarroSide = temCarroSide;
    }
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
