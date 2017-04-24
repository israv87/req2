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
public class Docente extends Persona{
    public String idDocente;

    public Docente(String idDocente, String id, String nombres, String email) {
        super(id, nombres, email);
        this.idDocente = idDocente;
    }

    @Override
    public String toString() {
        return "Docente{" + "idDocente=" + idDocente + '}';
    }
    
    
}
