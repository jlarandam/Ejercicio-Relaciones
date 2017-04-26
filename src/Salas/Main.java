/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Koonda15
 */
public class Main {
    private static Scanner s = new Scanner(System.in);
    private static Programacion program;
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(24, "Abril", 2017);
        Fecha fecha2 = new Fecha(25, "Abril", 2017);
        Fecha fecha3 = new Fecha(26, "Abril", 2017);
        Fecha fecha4 = new Fecha(27, "Abril", 2017);
        Fecha fecha5 = new Fecha(28, "Abril", 2017);
        Fecha fecha6 = new Fecha(29, "Abril", 2017);
        Fecha fecha7 = new Fecha(30, "Abril", 2017);
        Fecha fecha8 = new Fecha(1, "Mayo", 2017);
        Fecha fecha9 = new Fecha(2, "Mayo", 2017);
        Fecha fecha10 = new Fecha(3, "Mayo", 2017);
        Fecha fecha11 = new Fecha(4, "Mayo", 2017);
        Fecha fecha12 = new Fecha(5, "Mayo", 2017);
        Fecha fecha13 = new Fecha(6, "Mayo", 2017);
        Fecha fecha14 = new Fecha(7, "Mayo", 2017);
        //Segmentos
        ArrayList<Segmento> segmentos = new ArrayList<>();
        Segmento seg1 = new Segmento(9, 10);
        Segmento seg2 = new Segmento(13, 14);
        Segmento seg3 = new Segmento(17, 18);
        segmentos.add(seg1);
        segmentos.add(seg2);
        segmentos.add(seg3);
        
        
        ArrayList<Dia>dias = new ArrayList<>();
        Dia dia1 = new Dia(fecha1, "Lunes", segmentos);
        Dia dia2 = new Dia(fecha2, "Martes", segmentos);
        Dia dia3 = new Dia(fecha3, "Miercoles", segmentos);
        Dia dia4 = new Dia(fecha4, "Jueves", segmentos);
        Dia dia5 = new Dia(fecha5, "Viernes", segmentos);
        dias.add(dia1);
        dias.add(dia2);
        dias.add(dia3);
        dias.add(dia4);
        dias.add(dia5);
        //semanas
        Semana semana1 = new Semana();
        Semana semana2 = new Semana();
        ArrayList <Semana> semanas1 = new ArrayList<>();
        semanas1.add(semana1);
        semanas1.add(semana2);
        
        
        Sala sala1 = new Sala(1, semanas1);
        Sala sala2 = new Sala (1,semanas1);
        ArrayList <Sala> salas = new ArrayList<>();
        salas.add(sala1);
        salas.add(sala2);
        semana1.setSala(salas);
        semana1.setNumero(1);
        semana1.setDia(dias);
        semana2.setSala(salas);
        semana2.setNumero(2);
        semana2.setDia(dias);
        
        program = new Programacion(salas);
        menu();
    }
    
    public static void menu(){
        System.out.println("1. escoja la semana "
                           + "2. escoja la Sala");
        int  a= s.nextInt();
        switch (a){
            case 1:
                    mostrarSemanas();
                    break;
            case 2:
                    mostrarSalas();
                    break;
            default:
                    System.out.println("Escoja una opcion disponible");
                    break;
        }
    }
    public static void mostrarSemanas(){
        for(int i = 0; i < program.getSala().get(1).getSemana().size(); i++){
            System.out.println((i+1)+". semana "+ (i+1) +"\n");
        }
        int a=s.nextInt();
        if(a<=program.getSala().get(1).getSemana().size()&&a>0){
            for(int i=0; i<program.getSala().get(1).getSemana().get(a-1).getDia().size(); i++){
                System.out.println((i+1)+". dia "+(i+1) +"\n");
            }
            int b=s.nextInt();
            if(b<=program.getSala().get(1).getSemana().get(a-1).getDia().size() && b>0){
                for(int i=0; i<program.getSala().get(1).getSemana().get(a-1).getDia().get(b-1).getSegmento().size() ;i++){
                    System.out.println((i+1) +". Segmento "+(i+1) +"\n");
                }
                int c=s.nextInt();
                if(c<=program.getSala().get(1).getSemana().get(a-1).getDia().get(b-1).getSegmento().size()&&c>0){
                    System.out.println(program.getSala().get(1).getSemana().get(a-1).getDia().get(b-1).getSegmento().get(c-1).toString());
                }
            }else{
                System.out.println("Selecciones numero valido");
                menu();
            }
            
        }else{
            System.out.println("Seleccione numero valido");
            menu();
        }
    }
    
    public static void mostrarSalas(){
        for(int i=0; i<program.getSala().size();i++){
            System.out.println((i+1)+ ". sala " + (i+1)+"\n");
        }
        
        int z=s.nextInt();
        if(z<=program.getSala().size()&&z>0){
            for(int i = 0; i < program.getSala().get(z-1).getSemana().size(); i++){
                System.out.println((i+1)+". semana "+ (i+1) +"\n");
            }
            int a=s.nextInt();
            if(a<=program.getSala().get(z-1).getSemana().size()&&a>0){
                for(int i=0; i<program.getSala().get(z-1).getSemana().get(a-1).getDia().size(); i++){
                    System.out.println((i+1)+". dia "+(i+1) +"\n");
                }
                int b=s.nextInt();
                if(b<=program.getSala().get(z-1).getSemana().get(a-1).getDia().size() && b>0){
                    for(int i=0; i<program.getSala().get(z-1).getSemana().get(a-1).getDia().get(b-1).getSegmento().size() ;i++){
                        System.out.println((i+1) +". Segmento "+(i+1) +"\n");
                    }
                    int c=s.nextInt();
                    if(c<=program.getSala().get(z-1).getSemana().get(a-1).getDia().get(b-1).getSegmento().size()&&c>0){
                        System.out.println(program.getSala().get(z-1).getSemana().get(a-1).getDia().get(b-1).getSegmento().get(c-1).toString());
                    }
                }else{
                    System.out.println("Selecciones numero valido");
                    menu();
                }

            }else{
                System.out.println("Seleccione numero valido");
                menu();
            }
        }else{
            System.out.println("Escoja opcion valida");
            menu();
        }
        
    }
    
}
