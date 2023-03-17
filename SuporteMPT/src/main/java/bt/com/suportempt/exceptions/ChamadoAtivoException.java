/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.com.suportempt.exceptions;

/**
 *
 * @author Truen
 */
public class ChamadoAtivoException extends Exception {

    private static final long serialVersionUID = -2346384470483785588L;

    public ChamadoAtivoException() {
        super("Já existe um chamado para esse patrimônio!");
    }

}
