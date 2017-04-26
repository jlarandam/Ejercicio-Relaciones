/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCarro;

import java.util.ArrayList;

/**
 *
 * @author Koonda15
 */
public class Persona {
    private ArrayList<Carro> carro;
    private String nombre;
    private int id;

    public Persona(ArrayList<Carro> carro, String nombre, int id) {
        this.carro = carro;
        this.nombre = nombre;
        this.id = id;
    }

    public ArrayList<Carro> getCarro() {
        return carro;
    }

    public void setCarro(ArrayList<Carro> carro) {
        this.carro = carro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void Lista(){
        for(int i=0; i<carro.size(); i++){
            System.out.println("Carro "+ (i+1) + " Dueño: " + nombre + ", " +"id: "
                               + id + ", " +carro.get(i).getChasis().toString() + "\n" + 
                               carro.get(i).getMotor().toString() +
                               "\n" + carro.get(i).getRueda().toString())
                               /*Carro.getChasis.getColor + CArr*/;
        }
        //System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Persona{" + "carro=" + carro + ", nombre=" + nombre + ", id=" + id + '}';
    }
    
    
    
}
