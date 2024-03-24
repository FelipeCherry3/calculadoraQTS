package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTestJunit {

    int soma, subtracao, multiplicacao;
    float divisao;

    @Test
    public void somarNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        soma = calculadora.soma(8,10);
        assertEquals(18,soma);
    }
}
