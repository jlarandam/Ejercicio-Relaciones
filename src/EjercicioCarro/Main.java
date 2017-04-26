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
public class Main {
    public static void main(String[] args) {
        ArrayList <Carro> carrosPepe = new ArrayList();
        //Chasis cKevrolet = new Chasis("Fufurufa", "Fibra de carbono" ,"A1");
        Rueda rKevrolet = new Rueda(40.0,"Todo terreno");
        Motor mKevrolet = new Motor(345, 543, 23534);
        
        //Chasis cFerrari = new Chasis("Rojo Ferrari","Aluminio" ,"El Ultimo");
        Rueda rFerrari = new Rueda(12.0,"Carreras");
        Motor mFerrari = new Motor(543, 234, 23423);
        
        Carro Kevrolet = new Carro(rKevrolet,/*cKevrolet*/ mKevrolet, "Azul","A1", "acero");
        Carro Ferrari = new Carro(rFerrari, mFerrari, "rojo", "F9", "Aluminio");
        
        carrosPepe.add(Kevrolet);
        carrosPepe.add(Ferrari);
        
        Persona pepe = new Persona(carrosPepe, "Pepe", 1894);
        
        pepe.Lista();
    }
}
