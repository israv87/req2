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
public class DocenteAuxiliar extends Docente {
    int horarioClase;

    public DocenteAuxiliar(int horarioClase, String idDocente, String id, String nombres, String email) {
        super(idDocente, id, nombres, email);
        this.horarioClase = horarioClase;
    }

    @Override
    public String toString() {
        return "DocenteAuxiliar{" + "horarioClase=" + horarioClase + '}';
    }
    
    
}
