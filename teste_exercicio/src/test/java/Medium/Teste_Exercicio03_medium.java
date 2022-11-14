package Medium;

import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Medium.Exercicio03_medium;

public class Teste_Exercicio03_medium {
    static Exercicio03_medium exercicio03_medium;

    @BeforeClass
    public static void before(){
        exercicio03_medium = new Exercicio03_medium();
    }

    @Test
    public void testeNumerosAcumulados(){
        exercicio03_medium.somaNumerosAcumulados();
    }
    
}
