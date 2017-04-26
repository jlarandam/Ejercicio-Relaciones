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
public class Categoria extends ObjetoDominante{
    private String nombre;
    private String descripcion;
    private Producto producto;

    public Categoria(String nombrec, String descripcionc, String id, String nombrep, String descripcionp, String nombrei, double cU) {
        super(id);
        this.nombre = nombrec;
        this.descripcion = descripcionc;
        this.producto = new Producto(nombrep, descripcionp, nombrei, cU, id);
    }
    
    public void Lista(){
        System.out.println("Categoria: "+nombre+" ---- Descripcion: "+ descripcion+"\nNombre Producto: "+producto.getNombre()+" ----- Descripcion: "+producto.getDescripcion()+" ---- Categoria: "+producto.getCategorias()+" \nItem: " +producto.getItem().get(0).getNombre()+ " ---- Unidades: "+ producto.getItem().get(0).getcU()+ " ---- Producto: " + producto.getItem().get(0).getProductos());
    }
    
    public String getNombre(){
    	return nombre;
    }
    
    public ArrayList<Producto> getProductos(){
    	ArrayList<Producto> p = new ArrayList<>();
    	p.add(this.producto);
    	return p;
    }

    @Override
    public String toString() {
        return "Categoria{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", producto=" + producto + '}';
    }
      
    
}
