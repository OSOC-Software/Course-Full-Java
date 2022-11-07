/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Clase1;

/**
 *
 * @author ASUS
 */
public class ClaseHija extends Clase1 {

    public ClaseHija() {
        super();
        this.attrProtegido = "Attr protegido desde hijo";
    }

    @Override
    public String toString() {
        return "ClaseHija{" + '}';  
    }

}
