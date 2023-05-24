package org.Cripto_Coins;

public class CriptoMoneda extends Moneda{
    private String algoritmoHash;

    public CriptoMoneda() {
        super("",0,0);
    }

    public CriptoMoneda(String algoritmoHash) {
        this.algoritmoHash = algoritmoHash;
    }

    public CriptoMoneda(String nombreIngresado, double cantidad, double valor, String algoritmoHash) {
        super(nombreIngresado, cantidad, valor);
        this.algoritmoHash = algoritmoHash;
    }

    public String getAlgoritmoHash() {
        return algoritmoHash;
    }

    public void setAlgoritmoHash(String algoritmoHash) {
        this.algoritmoHash = algoritmoHash;
    }

}
