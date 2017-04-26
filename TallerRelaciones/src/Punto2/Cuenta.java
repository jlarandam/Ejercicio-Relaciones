/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Cuenta {
    private Integer numero;
    private double saldo;
    private Date FechaCreacion;
    private String cliente;
    private ArrayList<Movimiento> movimientos ;

    public Cuenta(Integer numero, double saldo, Date FechaCreacion,String cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.FechaCreacion = FechaCreacion;
        this.movimientos = new ArrayList<>();
        this.cliente=cliente;
    }

   
    
    
    
    public Integer getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public String getCliente() {
        return cliente;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.FechaCreacion = fechaCreacion;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    public void addMovimiento(Date fecha, double SaldoPrecedencia, double cantidad, Tipo tipo){
        Movimiento movimiento1= new Movimiento(fecha,SaldoPrecedencia,cantidad,tipo);
        movimientos.add(movimiento1);
    }
    
    
}
