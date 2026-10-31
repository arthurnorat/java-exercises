package classes;

public class Funcionario {
    private String  nome;
    public double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getInfo() {
        return "Nome: " + nome + ", salário: " + salario;
    }

    public void aumentarSalario (double aumento) {
        salario += aumento;
        // aumento 1000.00
    }

    public void aumentarSalario (int porcentagem) {
        salario += salario * porcentagem / 100;
        // aumento 10%
    }

    public void alterarQualquerSalario (Funcionario funcionario, double novoSalario) {
        funcionario.salario = novoSalario;
    }

    
}
