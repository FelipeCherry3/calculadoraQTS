package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Felipe
 * @version 1.0
 * @since release 1.0
 */

public class CalcTestJunit {

    /*
    * Classe de Testes Utilizando Framework Junit
    *
     */

    /**
     * Cenário 1 - Teste soma com um dois número positivo
     */
    @Test
    public void somarNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(18,calculadora.soma(8,10));
    }

    /**
     * Cenário 2 - Teste soma com um número positivo e um zero
     */
    @Test
    public void somarPositivoZero() {
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(3, calculadora.soma(3, 0));
    }

    /**
     * Cenário 3 - Teste soma dois números 0
     */
    @Test
    public void somaZeroComZero(){
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(0, calculadora.soma(0,0));
    }

    /**
     * Cenário 4 - Teste de Subtração de dois números positivos
     */
    @Test
    public void subtrairDoisNumPositivo(){
        Calculadora calculadora= new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(2,calculadora.subtracao(4,2));
    }

    /**
     * Cenário 5 - Teste de Subtração de valor 0 e valor positivos
     */
    @Test
    public void subtrairZeroComPositivo(){
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(3,calculadora.subtracao(0,3));
    }

    /**
     * Cenário 6 - Teste de Subtração de valores negativos
     */
    @Test
    public void subtrairValoresNegativos(){
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(0, calculadora.subtracao(-5,-5));
    }

    /**
     * Cenário 7 - Teste de multiplicação de valores positivos
     */
    @Test
    public void multiplicarValoresPositivos(){
        //Teste de multiplicação de valores positivos
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(30, calculadora.multi(6,5));
    }

    /**
     * Cenário 8 - Teste de multiplicação de valores negativos
     */
    @Test
    public void multiplicarValoresNegativos(){
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(30, calculadora.multi(-6,-5));
    }

    /**
     * Cenário 9 - Teste de multiplicação de valores positivos e negativos
     */
    @Test
    public void multiplicarValorNegativoEPositivo(){
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(-30, calculadora.multi(-6,5));
    }

    /**
     * Cenário 10 - Teste de multiplicação de valor por 0
     */
    @Test
    public void multiplicarPorZero(){
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(0, calculadora.multi(30 ,0));
    }

    /**
     * Cenário 11 - Teste de divisao de valores positivos
     */
    @Test
    public void divisaoNumeroPositivo(){
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(4,calculadora.divisao(230,50));
    }

    /**
     * Cenário 12 - Teste de divisao de valor positivo e negativo
     */
    @Test
    public void divisaoNumeroPositivoENegativo(){
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(-7,calculadora.divisao(-230,30));
    }

    /**
     * Cenário 13 - Teste de divisao de valores negativos
     */
    @Test
    public void divisaoNumeroNegativo(){
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(0,calculadora.divisao(-23,-530));
    }

    /**
     * Cenário 14 - Teste de divisao por 0
     */
    @Test
    public void divisaoPorZero(){
        Calculadora calculadora = new Calculadora();
        //Modelo Comparativo do Teste
        assertEquals(0,calculadora.divisao(0,-530));
    }
}
