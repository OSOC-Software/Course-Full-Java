/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracion;

/**
 *
 * @author ASUS
 */
public enum Continentes {

    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(44),
    OCEANIA(14);

    private final int paises;

    Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return paises;
    }

}
