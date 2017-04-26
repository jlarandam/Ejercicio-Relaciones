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
public class Veterinaria {
    public ArrayList<Persona> personas;

    public Veterinaria() {
        this.personas= new ArrayList<>();
    }
    
    public void addPersona(Persona persona){
        personas.add(persona);
    }
    public void removePet(Pet pet){
        pet=null;
    }
    
    public void showPetsByType (String sounds){
        for(int i=0;i<personas.size();i++){
            for(int j=0;j<personas.get(i).getPets().size();j++){
                if(sounds == personas.get(i).getPets().get(j).sound()){
                     System.out.println(personas.get(i).getPets().get(j).getName());
                }
            }
        }
    }
    public void showPets(){
        for(int i=0;i<personas.size();i++){
            for(int j=0;j<personas.get(i).getPets().size();j++){
                 System.out.println(personas.get(i).getPets().get(j).getName());
            }
        }
    }
}
