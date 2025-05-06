package frotaveiculos;

public class Motorista {
    private String nome;
    private String cnh;
    private Veiculo veiculo_atual;

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
        this.veiculo_atual = null;
    }

    public void atribuir_veiculo(Veiculo veiculo) {
        this.veiculo_atual = veiculo;
    }

    public void remover_veiculo() {
        this.veiculo_atual = null;
    }

    @Override
    public String toString() {
        String veiculoInfo = (veiculo_atual != null) ? ", veiculo_atual=" + veiculo_atual : "";
        return "Motorista{" +
                "nome='" + nome + '\'' +
                ", cnh='" + cnh + '\'' +
                veiculoInfo +
                '}';
    }
}
