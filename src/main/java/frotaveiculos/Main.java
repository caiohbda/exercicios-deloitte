package frotaveiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("ford", "fusion", "2014", 0, 4);
        Caminhao caminhao = new Caminhao("scania", "113", "2020", 0, 500);
        Motorista motorista = new Motorista("Mario", "1234");
        Motorista motorista2 = new Motorista("Carlos", "4321");
        Frota frota = new Frota();

        motorista.atribuir_veiculo(carro);
        motorista2.atribuir_veiculo(caminhao);
        frota.adicionar_motorista(motorista);
        frota.adicionar_motorista(motorista2);
        frota.adicionar_veiculo(carro);
        frota.adicionar_veiculo(caminhao);
        System.out.println(motorista.exibir_info());
    }
}

