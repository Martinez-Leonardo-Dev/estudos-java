import java.util.Scanner;
import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double novoSalario) {
        this.salario = novoSalario; // 's' minúsculo para bater com o atributo
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<Funcionario> empresa = new ArrayList<>();

        System.out.println("\n---- Relação de Funcionários ---");
        System.out.println("---- Digite o nome do funcionário: ---");
        String nomeFuncionario = leitor.nextLine();

        System.out.println("---- Digite quanto será o salário deste funcionário: ---");
        double empregSalario = leitor.nextDouble();

        Funcionario empregado = new Funcionario(nomeFuncionario, empregSalario);

        empresa.add(empregado);

        for (Funcionario F : empresa) {
            System.out.println("O funcionário recém-contratado se chama: " + F.getNome() + " com a remuneração de: R$ " + F.getSalario());
            System.out.println("Bem-vindo " + F.getNome() + "!\n");
        }

        leitor.close();
    }
}