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
public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("32432", "Pepe", "Mendez", "30183029","Cr 9","Cll 10","Bogota","Cundinamarca","35432","Colombia");       
        ArrayList<Categoria>categorias = new ArrayList<>();
        Categoria categoria = new Categoria("Equipaje", "equipaje de usuario", "jdikw", "Maletin", "maletin objetos", "maletin", 10.0);
        categorias.add(categoria);
        categoria.getProductos().get(0).getItem().get(0).setProducto(categoria.getProductos());
        categoria.getProductos().get(0).setCategoria(categorias);
        categoria.Lista();
        
        
    }
 
}
