package frotaveiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private String ano;
    private double velocidade;

    public Veiculo(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
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
        this.velocidade = velocidade;
    }

    public void acelerar() {
        System.out.println("acelerou 10km/h");
        velocidade = velocidade + 10;
    }

    public void frear() {
        if (velocidade <= 0){
            System.out.println("o veiculo esta parado");
        }
        System.out.println("freiou... reduziu 10km/h");
        velocidade = velocidade - 10;
    }

    public String exibir_info() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
