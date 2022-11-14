package Medium;

import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Medium.Exercicio05_medium;

public class Teste_Exercicio05_medium {
    static Exercicio05_medium exercicio05_medium;

    @BeforeClass
    public static void before() {
        exercicio05_medium = new Exercicio05_medium();
    }

    @Test
    public void testeTabuada() {
        exercicio05_medium.exibeMenorNumero();

    }
}
