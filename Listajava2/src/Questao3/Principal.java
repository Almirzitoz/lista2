package Questao3;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto carro = new Produto();
        Produto mouse = new Produto();
        Produto microondas = new Produto();
        Produto nokiaTijolao = new Produto();

        carro.nomeProduto = "Carro";
        carro.valorProduto = 15000.00;

        mouse.nomeProduto ="Mouse";
        mouse.valorProduto = 50.00;

        microondas.nomeProduto = "Microondas";
        microondas.valorProduto = 250.00;

        nokiaTijolao.nomeProduto = "Nokia Tijolão";
        nokiaTijolao.valorProduto = 125.00;

        System.out.println("Produtos: ");
        System.out.println("1- "+carro.nomeProduto+" vendido= "+carro.vendido);
        System.out.println("2- "+mouse.nomeProduto+" vendido= "+mouse.vendido);
        System.out.println("3- "+microondas.nomeProduto+" vendido= "+microondas.vendido);
        System.out.println("4- "+nokiaTijolao.nomeProduto+" vendido= "+nokiaTijolao.vendido);
        System.out.println("5- Sair");
        
        while(true){
            double valor;
            System.out.print("Digite a opção escolhida: ");
            int opcaoEscolhida = scanner.nextInt();
            if (opcaoEscolhida == 5) {
                break;
            }

            if (opcaoEscolhida ==1) {
                if (carro.vendido == true) {
                    System.out.print("Item já vendido! Selecione outra opção:");
                    opcaoEscolhida = scanner.nextInt();
                }

                if (carro.vendido == false) {
                    valor = carro.valorProduto-(carro.valorProduto*0.25);
                    System.out.println("Valor a ser pago: "+valor);
                    carro.venderProduto();
                }
            }

            if (opcaoEscolhida ==2) {
                if (mouse.vendido == true) {
                    System.out.print("Item já vendido! Selecione outra opção:");
                    opcaoEscolhida = scanner.nextInt();
                }

                if (mouse.vendido == false) {
                    valor = mouse.valorProduto;
                    System.out.println("Valor a ser pago: "+valor);
                    mouse.venderProduto();
                }
            }

            if (opcaoEscolhida ==3) {
                if (microondas.vendido == true) {
                    System.out.print("Item já vendido! Selecione outra opção:");
                    opcaoEscolhida = scanner.nextInt();
                }

                if (microondas.vendido == false) {
                    valor = microondas.valorProduto-(microondas.valorProduto*0.2);
                    System.out.println("Valor a ser pago: "+valor);
                    microondas.venderProduto();
                }
            }

            if (opcaoEscolhida ==4) {
                if (nokiaTijolao.vendido == true) {
                    System.out.print("Item já vendido! Selecione outra opção:");
                    opcaoEscolhida = scanner.nextInt();
                }

                if (nokiaTijolao.vendido == false) {
                    valor = nokiaTijolao.valorProduto-(nokiaTijolao.valorProduto*0.1);
                    System.out.println("Valor a ser pago: "+valor);
                    nokiaTijolao.venderProduto();
                }
            }




        }










        scanner.close();
    }
}
