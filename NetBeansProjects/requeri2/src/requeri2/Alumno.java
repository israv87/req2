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
public class Alumno extends Persona{
    public String idALumno;

    public Alumno(String idALumno, String id, String nombres, String email) {
        super(id, nombres, email);
        this.idALumno = idALumno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idALumno=" + idALumno + '}';
    }
    
    
}
