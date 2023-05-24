package org.Cripto_Coins;

import java.util.ArrayList;

public class PlataformaIntercambio {
    private String nombrePlataforma;
    private ArrayList<Cartera> listaCarteras;

    public PlataformaIntercambio() {
        this.nombrePlataforma="";
        listaCarteras= new ArrayList<>();
        for (int i = 0; i <listaCarteras.size() ; i++) {
            listaCarteras.add(new Cartera());
        }

    }

    public PlataformaIntercambio(String nombrePlataforma, ArrayList<Cartera> listaCarteras) {
        this.nombrePlataforma = nombrePlataforma;
        listaCarteras= new ArrayList<>();
        for (int i = 0; i <listaCarteras.size() ; i++) {
            listaCarteras.add(new Cartera());
        }
    }

    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    public ArrayList<Cartera> getListaCarteras() {
        return listaCarteras;
    }

    public void setListaCarteras(ArrayList<Cartera> listaCarteras) {
        this.listaCarteras = listaCarteras;
    }
}
