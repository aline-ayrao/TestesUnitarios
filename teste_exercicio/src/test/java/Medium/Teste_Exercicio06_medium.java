package Medium;

import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Medium.Exercicio06_medium;

public class Teste_Exercicio06_medium {
    static Exercicio06_medium exercicio06_medium;

    @BeforeClass
    public static void before() {
        exercicio06_medium = new Exercicio06_medium();
    }

    @Test
    public void testeTabuada() {
        exercicio06_medium.calculaFatorial(25);

    }
}
