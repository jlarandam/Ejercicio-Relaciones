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
public class Chasis {
    private String color;
    private String material;
    private String modelo;

    public Chasis(String color, String material, String modelo) {
        this.color = color;
        this.material = material;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Chasis{" + "color=" + color + ", material=" + material + ", modelo=" + modelo + '}';
    }
    
}
