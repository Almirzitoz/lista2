package Questao2;

public class Principal {
    public static void main(String[] args) {
        //Esqueci que era loja de eletrônicos e fiquei com preguiça de mudar as descrições, então continuei como uma padadria
        Informacoes pao = new Informacoes();
        Informacoes cafe = new Informacoes();
        Informacoes biscoito = new Informacoes();

        pao.numeroPoduto = 0;
        pao.descricaoProduto = "É um pão feito de trigo :D";
        pao.quantidadeVendida = 20;
        pao.precoUnitario = 0.5;
        pao.setFatura();

        cafe.numeroPoduto = 1;
        cafe.descricaoProduto = "É um café feito de um pó de café torrado em moído no começo do dia";
        cafe.quantidadeVendida = 25;
        cafe.precoUnitario = 2.50;
        cafe.setFatura();

        biscoito.numeroPoduto = 2;
        biscoito.descricaoProduto ="É um bisscoito de polvilho";
        biscoito.quantidadeVendida = 15;
        biscoito.precoUnitario = 3.00;
        biscoito.setFatura();


        System.out.println("Pão:"+"\nNúmero:"+pao.numeroPoduto+"\nDescrição:"+pao.descricaoProduto+"\nQuantidade vendida:"+pao.quantidadeVendida+"\nValor de venda(unidade):"+pao.precoUnitario+"\nValor fatura:"+pao.precoTotalFatura);
        System.out.println("Café:"+"\nNúmero:"+cafe.numeroPoduto+"\nDescrição:"+cafe.descricaoProduto+"\nQuantidade vendida:"+cafe.quantidadeVendida+"\nValor de venda(unidade):"+cafe.precoUnitario+"\nValor fatura:"+cafe.precoTotalFatura);
        System.out.println("Biscoito:"+"\nNúmero:"+biscoito.numeroPoduto+"\nDescrição:"+biscoito.descricaoProduto+"\nQuantidade vendida:"+biscoito.quantidadeVendida+"\nValor de venda(unidade):"+biscoito.precoUnitario+"\nValor fatura:"+biscoito.precoTotalFatura);

        pao.descontoValor =10;
        biscoito.descontoValor = 5;
        cafe.descontoValor = 10;
        pao.desconto();
        biscoito.desconto();
        cafe.desconto();

        System.out.println("Pão depois do desconto:"+"\nNúmero:"+pao.numeroPoduto+"\nDescrição:"+pao.descricaoProduto+"\nQuantidade vendida:"+pao.quantidadeVendida+"\nValor de venda(unidade):"+pao.precoUnitario+"\nValor fatura:"+pao.precoTotalFatura);
        System.out.println("Café depois do desconto:"+"\nNúmero:"+cafe.numeroPoduto+"\nDescrição:"+cafe.descricaoProduto+"\nQuantidade vendida:"+cafe.quantidadeVendida+"\nValor de venda(unidade):"+cafe.precoUnitario+"\nValor fatura:"+cafe.precoTotalFatura);
        System.out.println("Biscoito depois do desconto:"+"\nNúmero:"+biscoito.numeroPoduto+"\nDescrição:"+biscoito.descricaoProduto+"\nQuantidade vendida:"+biscoito.quantidadeVendida+"\nValor de venda(unidade):"+biscoito.precoUnitario+"\nValor fatura:"+biscoito.precoTotalFatura);





    }
}
