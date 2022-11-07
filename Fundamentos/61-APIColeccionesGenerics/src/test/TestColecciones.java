/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class TestColecciones {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miercoless");
        lista.add("Jueves");
        lista.add("Viernes");
        imprimir(lista);
        String elemento = lista.get(0);
        System.out.println("elemento = " + elemento);
//Por forEach
        //System.out.println("Por forEach");
//        for (Object element : lista) {
//            System.out.println(element);
//        }
//        //Por funcion lambda o funcion flecha (arrow)
//        System.out.println("Por ArrowFunction");
//        lista.forEach(element -> {
//            System.out.println(element);
//        });

        Set<String> listaSet = new HashSet<>();
        listaSet.add("Enero");
        listaSet.add("Febrero");
        listaSet.add("Marzo");
        listaSet.add("Abril");
        listaSet.add("Mayo");
        imprimir(listaSet);

        Map<String, String> mapa = new HashMap<>();
        mapa.put("1", "Juan");
        mapa.put("2", "Diego");
        mapa.put("3", "Osorio");
        mapa.put("4", "Castrillon");

    }

    public static void imprimir(Collection<String> list) {
        list.forEach(element -> {
            System.out.println(element);
        });
    }

}
