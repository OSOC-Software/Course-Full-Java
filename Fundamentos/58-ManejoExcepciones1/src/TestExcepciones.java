 
import static aritmetica.Aritmetica.division;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class TestExcepciones {

    public static void main(String[] args) {

        int res = 0;
        try {
            //res = 19 / 0;
            res = division(1, 0);
            System.out.println("res = " + res);
        } catch (Exception e) {
            System.out.println("Dision por cero");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la division entre cero");
        }

    }
}
