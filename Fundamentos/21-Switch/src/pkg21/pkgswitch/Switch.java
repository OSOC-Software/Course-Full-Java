/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.pkgswitch;

/**
 *
 * @author ASUS
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        var numero = 2;
        var numT = "";

        switch (numero) {
            case 1:
                numT = "Uno";
                break;
            case 2:
                numT = "Dos";
                break;
            case 3:
                numT = "Tres";
                break;
            case 4:
                numT = "Cuatro";
                break;
            default:
                numT = "Ninguno coincide";
        }

        System.out.println("numT = " + numT);
    }

}
