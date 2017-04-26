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
public class Producto extends ObjetoDominante {
    private String nombre;
    private String descripcion;
    private ArrayList<Categoria> categoria;
    private Item item;
    //private ArrayList<Producto>productos;
    //private double cU;

    public Producto(String nombrep, String descripcionp, String nombrei, double cU, String id) {
        super(id);
        this.nombre = nombrep;
        this.descripcion = descripcionp;
        this.item = new Item(nombrei, cU, id);
    }
    
    public void setCategoria(ArrayList<Categoria> categoria){
    	this.categoria=categoria;
    }
    
    public String getNombre(){
    	return nombre;
    }
    
    public String getDescripcion(){
    	return descripcion;
    }
    
    public String getCategorias(){
    	String cat = "";
    	for (int i = 0; i < categoria.size(); i++){
    		cat = cat + categoria.get(i).getNombre();
    	}
    	return cat;
    }
    
    public ArrayList<Item> getItem(){
    	ArrayList<Item> p = new ArrayList<>();
    	p.add(this.item);
    	return p;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria + ", item=" + item + '}';
    }

    

    
    
}
