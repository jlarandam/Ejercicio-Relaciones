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
public class Motor {
    private int pot;
    private double cilindraje;
    private double rpm;

    public Motor(int pot, double cilindraje, double rpm) {
        this.pot = pot;
        this.cilindraje = cilindraje;
        this.rpm = rpm;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return "Motor{" + "pot=" + pot + ", cilindraje=" + cilindraje + ", rpm=" + rpm + '}';
    }
    
    
}
