/**
 * 
 */
package com.soa.business;

/**
 * 
 * @param n1        Operando 1
 * @param n2        Operando 2
 * @param operacion Operación a realizar: sumar, restar, multiplicar o dividir.
 * @return
 */
public class Calculadora {

    public double calcular(double n1, double n2, String operacion) {
        double resultado = 0;
        switch (operacion) {
        case "sumar":
            resultado = n1 + n2;
            break;
        case "restar":
            resultado = n1 - n2;
            break;
        case "multiplicar":
            resultado = n1 * n2;
            break;
        case "dividir":
            resultado = n1 / n2;
            break;
        default:
            throw new RuntimeException("Operación no valida");
        }
        return resultado;
    }

}
