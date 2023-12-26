/**
 * 
 */
package com.soa;

import com.soa.business.Calculadora;
/**
 * 
 */
public class Principal {

    /**
     * @param args
     */
    public static void main(String[] args) {
         Calculadora calc = new Calculadora();
         double result = calc.calcular(3, 3, "restar");
         System.out.println(result);
    }

}
