/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.ArrayList;

/**
 *
 * @author Koonda15
 */
public class Item extends ObjetoDominante{
    private String nombre;
    private double cU;
    private ArrayList<Producto> producto;

    public Item(String nombre, double cU,String id) {
        super(id);
        this.nombre = nombre;
        this.cU = cU;
    }
    
    public void setProducto(ArrayList<Producto> producto){
    	this.producto=producto;
    }
    
    public double getcU(){
    	return cU;
    }
    
    public String getNombre(){
    	return nombre;
    }
    
    public String getProductos(){
    	String cat = "";
    	for (int i = 0; i < producto.size(); i++){
    		cat = cat + producto.get(i).getNombre();
    	}
    	return cat;
    }
    
    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombre + ", cU=" + cU + ", producto=" + producto + '}';
    }

    
    
}
