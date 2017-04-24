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
public class Persona {
    String id,nombres,email;
    ComponenteEducativo materia;

    public Persona(String id, String nombres, String email, ComponenteEducativo materia) {
        this.id = id;
        this.nombres = nombres;
        this.email = email;
        this.materia = materia;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombres=" + nombres + ", email=" + email + ", materia=" + materia + '}';
    }
    

    
}
