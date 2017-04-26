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
public class Carro {
   private Rueda rueda;
   private Chasis chasis;
   private Motor motor;

    public Carro(Rueda rueda,  Motor motor, String color, String modelo, String material) {
        this.chasis = new Chasis(color, material, modelo);
        this.motor = motor;
        this.rueda=rueda;
    }
    
    public Chasis getChasis() {
        return chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public Rueda getRueda() {
        return rueda;
    }

    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" + "rueda=" + rueda + ", chasis=" + chasis + ", motor=" + motor + '}';
    }
    
    

}
