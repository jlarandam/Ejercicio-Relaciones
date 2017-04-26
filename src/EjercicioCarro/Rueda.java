/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCarro;

/**
 *
 * @author Koonda15
 */
public class Rueda {
     private double rad;
    //private String material;
    private String tipo;

    public Rueda(double rad, String tipo) {
        this.rad = rad;
        
        this.tipo = tipo;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

//    public String getMaterial() {
//        return material;
//    }
//
//    public void setMaterial(String material) {
//        this.material = material;
//    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Rueda{" + "rad=" + rad + ", tipo=" + tipo + '}';
    }
    
    
}

