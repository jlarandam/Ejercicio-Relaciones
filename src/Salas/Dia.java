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
public class Dia {
    private Fecha fecha;
    private String nombre;
    private ArrayList<Segmento> segmento;

    public Dia(Fecha fecha, String nombre, ArrayList<Segmento> segmento) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.segmento = segmento;
    }

    

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Segmento> getSegmento() {
        return segmento;
    }
    
    public Segmento getSegmentos(int i){
        return getSegmento().get(i);
    }

    public void setSegmento(ArrayList<Segmento> segmento) {
        this.segmento = segmento;
    }

    @Override
    public String toString() {
        return "Dia{" + "fecha=" + fecha + ", nombre=" + nombre + ", segmento=" + segmento + '}';
    }

    

    

    

    
    
}
