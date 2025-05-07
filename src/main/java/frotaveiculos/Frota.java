package frotaveiculos;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;
    private List<Motorista> motoristas;

    public Frota(List<Veiculo> veiculos, List<Motorista> motoristas) {
        this.veiculos = veiculos;
        this.motoristas = motoristas;
    }

    public Frota() {
        veiculos = new ArrayList<>();
        motoristas = new ArrayList<>();
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public void adicionar_veiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void adicionar_motorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public void listar_frota() {
        System.out.println("Lista de veiculos");
        for (Veiculo veiculo: veiculos){
            System.out.println(veiculo.toString());
        }

        System.out.println("\nLista de Motoristas");
        for(Motorista motorista: motoristas) {
            System.out.println(motorista.toString());
        }
    }
}
