package Questao5;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        evento evento = new evento();
        ingressos ingressos = new ingressos();
        ingressosVip ingressosVip = new ingressosVip();
        evento.ativarListas();
        System.out.println("Bem vindo!");
        boolean fim = false;
        Scanner scanner = new Scanner(System.in);
        while (fim != true) {
        System.out.println("Digite o número da ação que deseja realizar: ");
        System.out.println("1- Comprar ingressos \n2- Ver vendas realizadas \n3- Sair");
        int escolha = scanner.nextInt();
        boolean opcaoValida = false;
        while (opcaoValida != true) {
            if (escolha == 1) {
                opcaoValida = true;
            }
            if (escolha ==2) {
                opcaoValida = true;
            }
            if (escolha == 3) {
                opcaoValida = true;
            }
            else{
                System.out.print("Opção inválida! Insira novamente:");
                escolha = scanner.nextInt();
            }
        }
        if(escolha == 1){
            System.out.println("Valor dos ingressos:"+"\n Normal: "+ingressos.getValor()+"\nVip: "+ ingressosVip.getValorVip());
            System.out.println("Selecione a opção de ingressos que deseja:\n1- ingressos normais\n2- Ingressos");
            int opcaoIngresso = scanner.nextInt();
            if (opcaoIngresso == 1) {
                System.out.println("Insira quantos ingressos serão comprados:");
                int quantidadeDeCompra = scanner.nextInt();
                for (int i = 0; i < quantidadeDeCompra; i++) {
                    System.out.println("Selecione o ingresso que deseja: ");
                    System.out.println(evento.getLista());
                    int escolhaIngresso = scanner.nextInt();
                    evento.setLista(escolhaIngresso);
                }
            }
            if (opcaoIngresso == 2) {
                System.out.println("Insira quantos ingressos serão comprados:");
                int quantidadeDeCompra = scanner.nextInt();
                    for (int i = 0; i < quantidadeDeCompra; i++) {
                    System.out.println("Selecione o ingresso que deseja: ");
                    System.out.println(evento.getListaVip());
                    int escolhaIngresso = scanner.nextInt();
                    evento.setListaVip(escolhaIngresso);
                }
            }

        }

        if (escolha == 2) {
            evento.verificarVendas();
            evento.verificarVendasVip();
            double valorArrecadado = evento.getVendidos() * ingressos.getValor();
            double valorArrecadadoVip = evento.getvendidosVip() * ingressosVip.getValorVip();
            System.out.println("Valor arrecado:\n"+"Ingresso normal: "+valorArrecadado+"\n Ingresso vip: "+valorArrecadadoVip);
            System.out.println("Ingressos normais não vendidos: "+evento.getNaoVendidos());
            System.out.println("Ingressos vip não vendidos: "+evento.getNaoVendidosVip());
        }

        if (escolha == 3) {
            fim =true;
        }
        }
        scanner.close();
    }
}
