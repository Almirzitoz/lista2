package Questao2;

public class Informacoes {
    public int numeroPoduto;
    public String descricaoProduto;
    public int quantidadeVendida;
    public double precoUnitario;
    public double precoTotalFatura;
    public int descontoValor;


    public void setFatura(){
        precoTotalFatura = precoUnitario*quantidadeVendida;
    }
    public void desconto(){
        precoUnitario = precoUnitario-(precoUnitario*(descontoValor/100));
    }
}
