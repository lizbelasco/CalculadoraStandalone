/**
 * 
 */
package com.soa.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class CalculadoraTest {

    @Test
    void sumarTest() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.calcular(56,4,"sumar");
        assertEquals(60, resultado);
    }
    
    @Test
    void restarTest() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.calcular(56,4,"restar");
        assertEquals(52, resultado);
    }
    
    @Test
    void multiplicarTest() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.calcular(56,4,"multiplicar");
        assertEquals(224, resultado);
    }
    
    @Test
    void dividirTest() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.calcular(56,4,"dividir");
        assertEquals(14, resultado);
    }
    
    @Test
    void operacionInvalidaTest() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.calcular(56,4,"otra");
        System.out.println(resultado);
    }

}
