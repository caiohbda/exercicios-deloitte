package frotaveiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private String ano;
    private double velocidade;

    public Veiculo(String marca, String modelo, String ano, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade >= 0 ? velocidade : 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        } else {
            System.out.println("Velocidade não pode ser negativa.");
        }
    }

    public void acelerar() {
        System.out.println("Acelerou 10km/h.");
        velocidade += 10;
    }

    public void frear() {
        if (velocidade <= 0) {
            System.out.println("O veículo já está parado.");
        } else {
            System.out.println("Freou... reduziu 10km/h.");
            velocidade -= 10;
        }
    }

    public String exibir_info() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", velocidade=" + velocidade +
                ',';
    }
}
