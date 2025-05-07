package frotaveiculos;

public class Caminhao extends Veiculo{
    private float capacidade_carga;


    public Caminhao(String marca, String modelo, String ano, double velocidade, float capacidade_carga) {
        super(marca, modelo, ano, velocidade);
        this.capacidade_carga = capacidade_carga;
    }

    public float getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(float capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }

    @Override
    public String exibir_info() {
        return super.exibir_info() + " capacidade_carga=" + capacidade_carga + "}";
    }
}
