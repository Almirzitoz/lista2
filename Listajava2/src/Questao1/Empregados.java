package Questao1;

public class Empregados {
    public String[] nome;
    public String[] sobrenome;
    public double[] salario;
    public double[] salarioDepoisDoAumento;

    public void calcularAlmento(){
        salarioDepoisDoAumento = new double[this.salario.length];
        for (int i = 0; i < this.salario.length; i++) {
            double dezPorCento = this.salario[i] * 0.10;
            salarioDepoisDoAumento[i] = this.salario[i] + dezPorCento;
        }
    }
}
