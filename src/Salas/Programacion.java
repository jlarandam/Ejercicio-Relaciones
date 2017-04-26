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
public class Programacion {
    private ArrayList<Sala> sala;

    public Programacion(ArrayList<Sala> sala) {
        this.sala = sala;
    }

    public ArrayList<Sala> getSala() {
        return sala;
    }

    public void setSala(ArrayList<Sala> sala) {
        this.sala = sala;
    }

    public void Lista(){
        System.out.println(getSala().toString());
    }
}
