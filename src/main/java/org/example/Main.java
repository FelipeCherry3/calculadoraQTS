package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Instância do Objeto
        Calculadora calc = new Calculadora();

        // Cenário de teste 1: Soma de dois números positivos
        int soma = calc.soma(3, 7);
        System.out.println("Soma de 3 e 7: " + soma); // valor = "10"

        // Cenário de teste 2: Soma de um número positivo e zero
        soma = calc.soma(3, 0);
        System.out.println("Soma de 3 e 0: " + soma); // valor = "3"

        // Cenário de teste 3: Soma de dois zeros
        soma = calc.soma(0, 0);
        System.out.println("Soma de 0 e 0: " + soma); // valor = "0"

        // Cenário de teste 4: Soma de um número positivo e um número negativo
        soma = calc.soma(3, -1);
        System.out.println("Soma de 3 e -1: " + soma); // valor =  "2"

        // Cenário de teste 5: Subtração de dois números positivos
        int subtracao = calc.subtracao(3, 7);
        System.out.println("Subtração de 3 por 7: " + subtracao); // valor = "-4"

        // Cenário de teste 6: Subtração de um número positivo e zero
        subtracao = calc.subtracao(3, 0);
        System.out.println("Subtração de 3 por 0: " + subtracao); // valor = "3"

        // Cenário de teste 7: Subtração de dois zeros
        subtracao = calc.subtracao(0, 0);
        System.out.println("Subtração de 0 por 0: " + subtracao); //valor =  "0"

        // Cenário de teste 8: Subtração de um número positivo e um número negativo
        subtracao = calc.subtracao(3, -1);
        System.out.println("Subtração de 3 por -1: " + subtracao); // valor = "4"

        // Cenário de teste 9: Divisão de dois números positivos
        float dividir = calc.divisao(6, 4);
        System.out.println("Divisão de 6 por 4: " + dividir); // valor = "1.5"

        // Cenário de teste 10: Divisão de um número positivo por zero
        //Utilizado bloco Try-Catch para tratar e lançar uma exceção do tipo ArithmeticException
        try {
            dividir = calc.divisao(3, 0);
            System.out.println("Divisão de 3 por 0: " + dividir); // Espera-se = Infinity
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é possível");
        }

        // Cenário de teste 11: Divisão de dois zeros
        //Utilizado bloco Try-Catch para tratar e lançar uma exceção do tipo ArithmeticException
        try {
            dividir = calc.divisao(0, 0);
            System.out.println("Divisão de 0 por 0: " + dividir); // Espera-se = NaN
        } catch (ArithmeticException e) {
            System.out.println("Indefinição matemática (NaN)");
        }

        // Cenário de teste 12: Divisão de um número positivo por um número negativo
        dividir = calc.divisao(3, -1);
        System.out.println("Divisão de 3 por -1: " + dividir); // valor =  "-3"

        // Cenário de teste 13: Multiplicação de dois números positivos
        int multiplicar = calc.multi(3, 7);
        System.out.println("Multiplicação de 3 por 7: " + multiplicar); // valor = "21"

        // Cenário de teste 14: Multiplicação de um número positivo por zero
        multiplicar = calc.multi(3, 0);
        System.out.println("Multiplicação de 3 por 0: " + multiplicar); // valor = "0"

        // Cenário de teste 15: Multiplicação de dois zeros
        multiplicar = calc.multi(0, 0);
        System.out.println("Multiplicação de 0 por 0: " + multiplicar); // valor = "0"

        // Cenário de teste 16: Multiplicação de um número positivo por um número negativo
        multiplicar = calc.multi(3, -1);
        System.out.println("Multiplicação de 3 por -1: " + multiplicar); //valor = "-3"

    }
}