package main;

public class Caminhao extends Veiculo {

private int numPortas;
private String tamanho;

public Caminhao(String modelo, int ano, int numPortas, String tamanho) { 
    super(modelo, ano);
this.numPortas = numPortas;
this.tamanho = tamanho;
}
@Override
public void acelerar() {
System.out.println("O Caminhão esta acelerando.");
}

public int getNumPortas(){ 
    return numPortas;
}
public void setNumPortas(int numPortas) { 
    this.numPortas = numPortas;
}

public String getTamanho(){ 
    return tamanho;
}
public void setTamanho(String tamanho) { 
    this.tamanho = tamanho;
}
}