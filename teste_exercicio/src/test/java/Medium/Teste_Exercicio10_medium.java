package Medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Medium.Exercicio10_medium;

public class Teste_Exercicio10_medium {
    static Exercicio10_medium exercicio10_medium;
    static int[] vetorFibonacciEsperado;

    @BeforeClass
    public static void before() {
        exercicio10_medium = new Exercicio10_medium();
        vetorFibonacciEsperado = new int[10];
            
        vetorFibonacciEsperado[0] = 0;
        vetorFibonacciEsperado[1] = 1;
        vetorFibonacciEsperado[2] = 1;
        vetorFibonacciEsperado[3] = 2;
        vetorFibonacciEsperado[4] = 3;
        vetorFibonacciEsperado[5] = 5;
        vetorFibonacciEsperado[6] = 8;
        vetorFibonacciEsperado[7] = 13;
        vetorFibonacciEsperado[8] = 21;
        vetorFibonacciEsperado[9] = 34;

    }

    @Test
    public void testeCalculaTermoFibonacci() {
        Assert.assertArrayEquals(vetorFibonacciEsperado, exercicio10_medium.calculaTermoFibonacci(10));

    }
    @Test
    public void testeimprimeVetor() {
         exercicio10_medium.imprimeVetor(vetorFibonacciEsperado);

    }
}