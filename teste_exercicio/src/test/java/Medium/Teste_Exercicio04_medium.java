package Medium;

import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Medium.Exercicio04_medium;

public class Teste_Exercicio04_medium {
    
    static Exercicio04_medium exercicio04_medium;

    @BeforeClass
    public static void before(){
        exercicio04_medium = new Exercicio04_medium();
    }

    @Test
    public void testeMultiplicaMil(){
        exercicio04_medium.multiplicacaoNumerosAteMil();
    }
}
