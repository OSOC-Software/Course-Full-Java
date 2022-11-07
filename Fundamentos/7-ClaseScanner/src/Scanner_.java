
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Scanner_ {

    public static void main(String[] args) {
        System.out.println("Escribir el nombre");
        Scanner consola = new Scanner(System.in);
        var usuario_ = consola.nextLine();
        System.out.println("usuario_ = " + usuario_);
        System.out.println("Escribe un titulo");
        var titulo = consola.nextLine();
        System.out.println("titulo = " + titulo + usuario_);
    }
}
