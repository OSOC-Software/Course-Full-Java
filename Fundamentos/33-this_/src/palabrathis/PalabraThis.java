/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrathis;

/**
 *
 * @author ASUS
 */
public class PalabraThis {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "OC");
        System.out.println("p1 = " + p1);
        System.out.println("p1.nombre = " + p1.nombre);
        System.out.println("p1.apellido = " + p1.apellido);
    }

}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        //super(); Llamada implicita a la clase padre: Object
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Imprimiendo objeto con this: " + this);
        new Imprimir().imprimir(this);
    }

}

class Imprimir {

    public void imprimir(Persona p1) {
        System.out.println("p1 desde imprimir= " + p1);
        System.out.println("this desde imprimir: " + this);
    }

}
