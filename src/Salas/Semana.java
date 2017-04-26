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
public class Semana {
    private int numero;
    private ArrayList<Dia> dia;
    private ArrayList<Sala> sala;

    public Semana() {
    }

    public Semana(int numero, ArrayList<Dia> dia, ArrayList<Sala> sala) {
        this.numero = numero;
        this.dia = dia;
        this.sala = sala;
    }
    
    

    public ArrayList<Sala> getSala() {
        return sala;
    }

    public void setSala(ArrayList<Sala> sala) {
        this.sala = sala;
    }
    public Sala getSalas(int i){
        return getSala().get(i);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Dia> getDia() {
        return dia;
    }
    
    public Dia getSDias(int i){
        return getDia().get(i);
    }

    public void setDia(ArrayList<Dia> dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Semana{" + "numero=" + numero + ", dia=" + dia + ", sala=" + sala + '}';
    }
    
    
    
    
    
}
