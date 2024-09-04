package Questao1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empregados empregado = new Empregados();
        System.out.print("Insira a quantidade de empregados: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 
        String[] nomes = new String[quantidade];
        String[] sobrenomes = new String[quantidade];
        double[] salariosAnuais = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Insira o Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Insira o Sobrenome: ");
            sobrenomes[i] = scanner.nextLine();
            System.out.print("Insira o salario mensal: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); 
            salariosAnuais[i] = salario * 12;
        }

        empregado.nome = nomes;
        empregado.sobrenome = sobrenomes;
        empregado.salario = salariosAnuais;
        empregado.calcularAlmento();

        System.out.println("Dados Finais:");

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Salario de " + empregado.nome[i] + " " + empregado.sobrenome[i] + ":");
            System.out.println("Salario anual antes do aumento: " + empregado.salario[i]);
            System.out.println("Salario anual depois do aumento: " + empregado.salarioDepoisDoAumento[i]);
        }

        scanner.close();
    }
}
