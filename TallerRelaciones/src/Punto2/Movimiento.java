/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Movimiento {
    private Date fecha;
    private double SaldoPrecedencia;
    private double cantidad;
    private Tipo tipo;

    public Movimiento(Date fecha, double SaldoPrecedencia, double cantidad, Tipo tipo) {
        this.fecha = fecha;
        this.SaldoPrecedencia = SaldoPrecedencia;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSaldoPrecedencia() {
        return SaldoPrecedencia;
    }

    public void setSaldoPrecedencia(double SaldoPrecedencia) {
        this.SaldoPrecedencia = SaldoPrecedencia;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    
    
    
}
