/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salas;

import java.util.ArrayList;

/**
 *
 * @author Koonda15
 */
public class Sala {
    private int numSala;
    private ArrayList<Semana> semana;

    public Sala(int numSala, ArrayList<Semana> semana) {
        this.numSala = numSala;
        this.semana = semana;
    }

    public Sala() {
        
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public ArrayList<Semana> getSemana() {
        return semana;
    }
    public Semana getSemanas(int i){
        return getSemana().get(i);
    }

    public void setSemana(ArrayList<Semana> semana) {
        this.semana = semana;
    }

    @Override
    public String toString() {
        return "Sala{" + "numSala=" + numSala + ", semana=" + semana + '}';
    }

    

    
    
}
