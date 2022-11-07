/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author ASUS
 */
public class ClaseGenerica<T> {

    private T obj;

    public ClaseGenerica(T obj) {
        this.obj = obj;
    }

    public void obtenerTipo() {
        System.out.println("El tipo es " + this.obj.getClass().getSimpleName());
    }
}
