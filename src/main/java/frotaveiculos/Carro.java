package frotaveiculos;

public class Carro extends Veiculo {
    private int num_portas;

    public Carro(String marca, String modelo, String ano, double velocidade, int num_portas) {
        super(marca, modelo, ano, velocidade);
        this.num_portas = num_portas;
    }

    public int getNum_portas() {
        return num_portas;
    }

    public void setNum_portas(int num_portas) {
        this.num_portas = num_portas;
    }

    @Override
    public String exibir_info() {
        return super.exibir_info() + " num_portas=" + num_portas + "}";
    }
}
