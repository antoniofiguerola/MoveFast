/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movefast.utilitats;

/**
 *
 * @author Miquel
 */
public class Exepcio extends Exception {

    /**
     * Creates a new instance of <code>Exepcio</code> without detail message.
     */
    public Exepcio() {
    }

    /**
     * Constructs an instance of <code>Exepcio</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public Exepcio(String msg) {
        super(msg);
    }
}
