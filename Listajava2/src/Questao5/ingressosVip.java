package Questao5;

public class ingressosVip {
    public static double valorAdicional = 140.20;

    public static double valorVip(){
        double valorvip = Questao5.ingressos.valor+valorAdicional;
        return(valorvip);
    }

    public static String valorVipString(){
        double valorVIP =valorVip();
        String ValorVipStr = Double.toString(valorVIP);
        return(ValorVipStr);
    }

    public double getValorVip(){
        return(valorVip());
    }
}
