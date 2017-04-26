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
public class main {
    public static void main(String[] args) {
        Date Fecha1 = new Date(104/11/29/1/1/1);
        Cuenta cuenta1 = new Cuenta(1754684, 200,Fecha1,"Andres");
        Date Fecha2 = new Date(18/03/15/2/5/1);
        Cuenta cuenta2 = new Cuenta(487952, 750,Fecha2,"Carlos");
        Tipo tipo2= new Tipo("Corriente");
        Tipo tipo1= new Tipo("Descuento");
        cuenta1.addMovimiento(Fecha1,500,3,tipo1);
        cuenta1.addMovimiento(Fecha1,700,7,tipo2);
        cuenta2.addMovimiento(Fecha2,675,8,tipo1);
        cuenta2.addMovimiento(Fecha2,798,5,tipo2);
        Banco b= new Banco("Banco de Sebastian");
        b.addCuenta(cuenta1);
        b.addCuenta(cuenta2);
        b.showInfo();
    }
}
