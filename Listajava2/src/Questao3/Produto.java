package Questao3;

public class Produto {
    public String nomeProduto;
    public double valorProduto;
    public boolean vendido = false;

    public void venderProduto(){
        this.vendido = true;
    }
}
