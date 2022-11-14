package Medium;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Medium.Exercicio01_medium;

public class Teste_Exercicio01_medium {
    static Exercicio01_medium exercicio01_medium;

    @BeforeClass
    public static void before(){
        exercicio01_medium = new Exercicio01_medium();
    }

    @Test
    public void testeTabuada(){
        exercicio01_medium.exibeParOuImpar();
    }
    
}
