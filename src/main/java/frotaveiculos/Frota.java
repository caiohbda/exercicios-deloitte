package frotaveiculos;

import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;
    private List<Motorista> motoristas;

    public Frota(List<Veiculo> veiculos, List<Motorista> motoristas) {
        this.veiculos = veiculos;
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
            System.out.println(veiculo);
        }

        System.out.println("\nLista de Motoristas");
        for(Motorista motorista: motoristas) {
            System.out.println(motorista);
        }
    }
}
