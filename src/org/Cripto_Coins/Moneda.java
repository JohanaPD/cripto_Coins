package org.Cripto_Coins;

import java.util.Objects;

public abstract class Moneda {
    private String nombreMoneda;
    private double cantidad;
    private double valor;

    public Moneda() {
    this("", 0,0 );}

    public Moneda(String nombreIngresado, double cantidad, double valor) {

       setNombre(nombreIngresado);
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public String setNombre(String nombre) {
        if(!nombre.isEmpty()) {
            this.nombreMoneda = nombre.toLowerCase().trim();
        }
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moneda moneda = (Moneda) o;
        return Double.compare(moneda.cantidad, cantidad) == 0 && Double.compare(moneda.valor, valor) == 0 && Objects.equals(nombreMoneda, moneda.nombreMoneda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreMoneda, cantidad, valor);
    }
}



