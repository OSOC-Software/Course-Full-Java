/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author ASUS
 */
public class OperacionExcepcion extends RuntimeException {

    public OperacionExcepcion(String message) {
        super(message);
    }

}
