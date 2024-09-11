package Questao4;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        dados dados = new dados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira quantas pessoas serão adicionadas: ");
        int contador = scanner.nextInt();
        for (int i = 0; i < contador; i++) {
            System.out.print("Insira um código: ");
            int codigo = scanner.nextInt();
            boolean validar = false;
            while (!validar) {
                validar = true;
                for (int j = 0; j < dados.codigo.length; j++) {
                    if (codigo == dados.codigo[j]) {
                        System.out.print("Código já usado! Insira outro: ");
                        codigo = scanner.nextInt();
                        validar = false;
                        break;
                    }
                }
            }
            validar = false;
            while (!validar) {
                if (codigo >= 1000 && codigo <= 9999) {
                    validar = true;
                } else {
                    System.out.print("Código inválido! Insira outro: ");
                    codigo = scanner.nextInt();
                }
            }
            dados.adicionarCodigo(codigo, i);

            System.out.print("Insira o nome: ");
            String nome = scanner.nextLine();
            dados.adicionarNome(nome, i);

            System.out.print("Insira o endereço: ");
            String endereco = scanner.nextLine();
            dados.adicionarEndeco(endereco, i);

            System.out.print("Insira o email: ");
            String email = scanner.nextLine();
            dados.adicionarEmail(email, i);

            System.out.print("Insira o telefone: ");
            int telefone = scanner.nextInt();
            String telefoneStr = Integer.toString(telefone);
            int contadorDigitos = telefoneStr.length();
            while (contadorDigitos != 8) {
                System.out.print("Telefone inválido: ");
                telefone = scanner.nextInt();
                telefoneStr = Integer.toString(telefone);
                contadorDigitos = telefoneStr.length();
            }
            dados.adicionarTelefone(telefone, i);
        }

        for (int j = 0; j < dados.codigo.length; j++) {
            System.out.println("Código: "+dados.codigo[j]);
            System.out.println("Nome: "+dados.nome[j]+"| Endereço: "+dados.endereco+"| Email: "+dados.email+"| Telefone: "+dados.telefone);
        }
        scanner.close();
    }
}
