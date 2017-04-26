/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

/**
 *
 * @author Sebastian
 */
public class Hamster extends Pet {
 private double weight;   

    public Hamster(String id, String name, String hairColor) {
        super(id, name, hairColor);
    }
    @Override
    public String sound(){
        return"tsssht";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
