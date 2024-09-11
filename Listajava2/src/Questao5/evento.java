package Questao5;
import java.util.ArrayList;
public class evento {
    private ArrayList<String> vagas = new ArrayList<>();
    private ArrayList<String> vagasVip = new ArrayList<>();
    private int vendidos;
    private int vendidosVip;
    private ArrayList<String> naoVendidos = new ArrayList<>();
    private ArrayList<String> naoVendidosVip = new ArrayList<>();

    public void ativarListas(){
        for (int index = 1; index < 20; index++) {
            String indice = Integer.toString(index);
            vagas.add(indice);
        }
        for (int i = 1; i < 10; i++) {
            String indice = Integer.toString(i);
            vagasVip.add(indice);
        }
    }
    public ArrayList<String> getLista(){
        return(vagas);
    }

    public ArrayList<String> getListaVip(){
        return(vagasVip);
    }

    public void setLista(int escolha){
        int indice = escolha -1;
        vagas.set(indice, "Vendido");
    }

    public void setListaVip(int escolha){
        int indice = escolha -1;
        vagasVip.set(indice, "Vendido");
    }

    public void verificarVendas(){
        int contador= 0;
        for (int i = 0; i < vagas.size(); i++) {
            if (vagas.get(i).equals("Vendido")) {
                contador++;
                this.vendidos = contador;
            }else{
                naoVendidos.add(vagas.get(i));
            }
        }
    }

    public void verificarVendasVip(){
        int contador= 0;
        for (int i = 0; i < vagasVip.size(); i++) {
            if (vagasVip.get(i).equals("Vendido")) {
                contador++;
                this.vendidosVip = contador;
            }else{
                naoVendidosVip.add(vagasVip.get(i));
            }
        }
    }

    public int getVendidos(){
        return(vendidos);
    }

    public int getvendidosVip(){
        return(vendidosVip);
    }

    public ArrayList<String> getNaoVendidos(){
        return(naoVendidos);
    }

    public ArrayList<String> getNaoVendidosVip(){
        return(naoVendidosVip);
    }
}
