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
public class DocenteTitular extends Docente {
    String horarioTutoria;

    public DocenteTitular(String horarioTutoria, String idDocente, String id, String nombres, String email) {
        super(idDocente, id, nombres, email);
        this.horarioTutoria = horarioTutoria;
    }

    @Override
    public String toString() {
        return "DocenteTitular{" + "horarioTutoria=" + horarioTutoria + '}';
    }
    
}
