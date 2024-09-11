package Questao4;

public class dados {
    public int[] codigo = new int[9999];
    public String[] nome = new String[9999];
    public String[] endereco = new String[9999];
    public String[] email = new String[9999];
    public int[] telefone = new int[9999];

    public void adicionarCodigo(int codigo,int indice){
        this.codigo[indice] = codigo;
    }

    public void adicionarNome(String nome, int indice){
        this.nome[indice] = nome;
    }

    public void adicionarEndeco(String endereco, int indice){
        this.endereco[indice] = endereco;
    }

    public void adicionarEmail(String email, int indice){
        this.email[indice] = email;
    }

    public void adicionarTelefone(int telefone, int indice){
        this.telefone[indice] = telefone;
    }
}
