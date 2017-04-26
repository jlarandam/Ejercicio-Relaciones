/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class Banco {
    private String code;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Tipo> tipos;

    public Banco(String code) {
        this.code = code;
        this.cuentas = new ArrayList<>();
        this.tipos = new ArrayList<>();
    }
    
    public void showInfo(){
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.getCliente());
            for(int i=0;i<cuenta.getMovimientos().size();i++){
                System.out.println(cuenta.getMovimientos().get(i).getFecha());
                System.out.println(cuenta.getMovimientos().get(i).getSaldoPrecedencia());
                System.out.println(cuenta.getMovimientos().get(i).getCantidad());
                System.out.println(cuenta.getMovimientos().get(i).getTipo().getCodigo());
            }
        }
    }
    public void addCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }
    
    public void addTipo(Tipo tipo){
        tipos.add(tipo);
    }
}
