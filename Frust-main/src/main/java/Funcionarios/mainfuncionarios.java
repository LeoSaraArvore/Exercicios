package Funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 3000);
        Gerente gerente = new Gerente("Ana", 5000, 1000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Carlos", 4000);

        System.out.println("Salário do funcionário " + funcionario.nome + ": R$" + funcionario.calcularSalario());
        System.out.println("Salário do gerente " + gerente.nome + ": R$" + gerente.calcularSalario());
        System.out.println("Salário do desenvolvedor " + desenvolvedor.nome + ": R$" + desenvolvedor.calcularSalario());
    }
}