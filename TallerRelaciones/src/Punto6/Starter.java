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
public class Starter {
    public Veterinaria v;
    public void readPets(Veterinaria v){
        v.showPets();
    }
    public static void main(String[] args) {
        Veterinaria V= new Veterinaria();
        Persona persona1 = new Persona ("12345", "Sebastian");
        Dog mascota1 = new Dog("adadad","Doggie","Golden","Pastor Aleman");
        persona1.addPet(mascota1);
        Persona persona2 = new Persona ("15", "Isabella");
        Cat mascota2 = new Cat("add","Kitty","Golden",true);
        persona2.addPet(mascota2);
        V.addPersona(persona1);
        V.addPersona(persona2);
        V.showPets();
    }
}
