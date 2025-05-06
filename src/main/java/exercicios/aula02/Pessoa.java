package exercicios.aula02;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String cpf;


    public Pessoa(String nome, int idade, double peso, double altura, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void verificarIdade(Pessoa pessoa) {
        if (pessoa.idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }
    }

    public void compararIdades(Pessoa pessoa1, Pessoa pessoa2) {
        if(pessoa1.idade > pessoa2.idade) {
            System.out.println(pessoa1.nome + " tem a idade superior");
        } else if(pessoa2.idade > pessoa1.idade) {
            System.out.println(pessoa2.nome + " tem a idade superior");
        } else {
            System.out.println("os dois tem idades iguais.");
        }
    }

    public double calcularImc() {
        double imc = this.peso/(this.altura * this.altura);
        imc = Math.round(imc * 100.0) / 100.0;
        System.out.println(imc);
        return imc;
    }

    public void validarCpf() {
        if(this.cpf.length() < 11) {
            System.out.println("cpf não validado, muito curto!!!");
        } else if(this.cpf.length() > 11) {
            System.out.println("cpf não validado, muito longo!!!");
        } else {
            System.out.println("cpf validado");
        }
    }
}
