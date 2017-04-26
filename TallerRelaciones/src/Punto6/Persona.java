/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class Persona {
    private String id;
    private String name;
    private ArrayList<Pet> pets;
    
    public void ShowPets(){
        for(Pet pet: pets){
            System.out.println(pet.getId()+pet.getName());
        }
    }

    public Persona(String id, String name) {
        this.id = id;
        this.name = name;
        this.pets = new ArrayList<>();
    }
    
    public void addPet(Pet pet){
        pets.add(pet);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    
}
