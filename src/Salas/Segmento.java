/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salas;

/**
 *
 * @author Koonda15
 */
public class Segmento {
    private int hInicio;
    private int hFin;

    public Segmento(int hInicio, int hFin) {
        this.hInicio = hInicio;
        this.hFin = hFin;
    }

    public int gethInicio() {
        return hInicio;
    }

    public void sethInicio(int hInicio) {
        this.hInicio = hInicio;
    }

    public int gethFin() {
        return hFin;
    }

    public void sethFin(int hFin) {
        this.hFin = hFin;
    }

    @Override
    public String toString() {
        return "Segmento{" + "hInicio=" + hInicio + ", hFin=" + hFin + '}';
    }

    
    
    
}
