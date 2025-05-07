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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Veiculo getVeiculo_atual() {
        return veiculo_atual;
    }

    public void setVeiculo_atual(Veiculo veiculo_atual) {
        this.veiculo_atual = veiculo_atual;
    }

    public void atribuir_veiculo(Veiculo veiculo) {
        this.veiculo_atual = veiculo;
    }

    public void remover_veiculo() {
        this.veiculo_atual = null;
    }

    public void dirigir() {
        System.out.println("dirigindo...");
    }

    public String exibir_info() {
        String veiculoInfo = (veiculo_atual != null) ? ", veiculo_atual=" + veiculo_atual.exibir_info() : "";
        return "Motorista{" +
                "nome='" + nome + '\'' +
                ", cnh='" + cnh + '\'' +
                veiculoInfo +
                '}';
    }
}
