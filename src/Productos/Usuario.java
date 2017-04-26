/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author Koonda15
 */
public class Usuario extends ObjetoDominante{
	
    private String primerNombre;
    private String segundoNombre;
    private String telefono;
    private String calle1;
    private String calle2;
    private String ciudad;
    private String estado;
    private String zipcode;
    private String country;

    public Usuario(String primerNombre, String segundoNombre, String telefono, String calle1, String calle2, String ciudad, String estado, String zipcode, String country, String id) {
        super(id);
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.telefono = telefono;
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.ciudad = ciudad;
        this.estado = estado;
        this.zipcode = zipcode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Usuario{" + "primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", telefono=" + telefono + ", calle1=" + calle1 + ", calle2=" + calle2 + ", ciudad=" + ciudad + ", estado=" + estado + ", zipcode=" + zipcode + ", country=" + country + '}';
    }
    
    
    
}
