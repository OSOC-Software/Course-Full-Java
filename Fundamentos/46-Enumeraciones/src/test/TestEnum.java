/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author ASUS
 */
public class TestEnum {

    public static void main(String[] args) {

        System.out.println("Dia 1: " + Dias.DOMINGO);
        System.out.println("Dia 2: " + Dias.DOMINGO);

        indicarDiaSemana(Dias.MARTES);
        System.out.println("Continente #4: " + Continentes.AFRICA.getPaises());

    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer Dia lunes");
                break;
            case MARTES:
                System.out.println("Segundo Dia martes");
                break;
        }
    }
}
