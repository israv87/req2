/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requeri2;

/**
 *
 * @author israel
 */
public class ComponenteEducativo {
    String codigo,nombre;
    int numCreditos;

    public ComponenteEducativo(String codigo, String nombre, int numCreditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numCreditos = numCreditos;
    }

    @Override
    public String toString() {
        return "ComponenteEducativo{" + "codigo=" + codigo + ", nombre=" + nombre + ", numCreditos=" + numCreditos + '}';
    }
    
}
