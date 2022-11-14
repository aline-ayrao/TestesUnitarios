import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Easy.Exercicio09_easy;
import teste_exercicio.Medium.Exercicio01_medium;

public class Teste_Exercicio09_easy {
    
    static Exercicio09_easy exercicio09_easy;
    
    @BeforeClass
    public static void before(){
        exercicio09_easy = new Exercicio09_easy();
    }
    @Test
    public void testeTabuada(){
        exercicio09_easy.calculaTabuada(10, null);
    }

}
