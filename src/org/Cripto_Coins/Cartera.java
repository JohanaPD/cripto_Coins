package org.Cripto_Coins;

public class Cartera implements OperacionesCartera {
    public static final int MAX_CRIPT_ARRAY = 10;
    private String usuario_email;
     CriptoMoneda[] criptomonedas= new CriptoMoneda[MAX_CRIPT_ARRAY];
    private int numCriptomonedas;

    public Cartera() {
        this.usuario_email="";
        for (int i = 0; i <MAX_CRIPT_ARRAY ; i++) {
           this.criptomonedas[i] = new CriptoMoneda();
        }
    }

    public Cartera(String usuario, double[] criptomonedas, int numCriptomonedas) {
        setUsuario_email(usuario);
        for (int i = 0; i <MAX_CRIPT_ARRAY ; i++) {
            this.criptomonedas[i] = new CriptoMoneda();
        }
        this.numCriptomonedas = numCriptomonedas;
    }

    public String getUsuario_email() {
        return usuario_email;
    }

    public void setUsuario_email(String usuario_email) {
        if(usuario_email.isEmpty()) {
            System.out.println("El usuario no puede estar vacío !!!");
        }
        else {
            char[] arrayCaracteres=usuario_email.toCharArray();
            String usuario_ok = "";
            for (int i = 0; i <usuario_email.length() ; i++) {
                if(arrayCaracteres[i]!= ' '){
                    usuario_ok += arrayCaracteres[i];
                }
                        }
            this.usuario_email = usuario_email.toLowerCase().trim();
        }

    }


    public int getNumCriptomonedas() {
        return numCriptomonedas;
    }

    public void setNumCriptomonedas(int numCriptomonedas) {
        this.numCriptomonedas = numCriptomonedas;
    }

    @Override
    public void addCriptoMoneda(CriptoMoneda criptoMoneda) throws Exception {
        if((buscarCriptomoneda(criptoMoneda.getNombreMoneda())==1)) {
            for (int i = 0; i < criptomonedas.length; i++) {
                    if (criptomonedas[i].getNombreMoneda().equals("")) {
                        criptomonedas[i] = criptoMoneda;
                        numCriptomonedas++;

                }
            }
        }


    }

    @Override
    public void deleteCriptoMoneda(CriptoMoneda criptoMoneda) {

        if((buscarCriptomoneda(criptoMoneda.getNombreMoneda())==1)) {
            for (int i = 0; i < criptomonedas.length; i++) {
                if (criptomonedas[i].equals(criptoMoneda)) {
                    criptomonedas[i] = new CriptoMoneda();
                }
            }
        }else{
            System.out.println("La criptomoneda no está dentro de la cartera, si quiere puede añadirla ");
        }
    }

    @Override
    public double takeCriptoMoneda(String nombre_cripto, double cantidad) throws Exception {
        if(buscarCriptomoneda(nombre_cripto)==1) {
            for (int i = 0; i < criptomonedas.length; i++) {
                if (criptomonedas[i].getNombreMoneda().equals(nombre_cripto) && criptomonedas[i].getValor() >= cantidad) {
                    double resta = criptomonedas[i].getValor() - cantidad;
                    criptomonedas[i].setCantidad(resta);
                    System.out.println("Su moneda " + criptomonedas[i].getNombreMoneda() + " tiene un saldo actual de  :"
                            + criptomonedas[i].getValor());
                    return 1;//se hizo la gestión
                } else {
                    System.out.println("La criptomoneda no está dentro de la cartera, si quiere puede añadirla ");
                }

            }
        }

            return 0; // no se hizo
    }

    @Override
    public int buscarCriptomoneda(String nombre) {
        for (int i = 0; i <criptomonedas.length ; i++) {
            if(criptomonedas[i].getNombreMoneda().equals(nombre)){
                return 1;
            }
        }
        return 0;
    }
}
