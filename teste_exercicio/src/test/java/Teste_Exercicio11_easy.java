import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Easy.Exercicio11_easy;

public class Teste_Exercicio11_easy {
    static  Exercicio11_easy exercicio11_easy;

    @BeforeClass
    public static void before(){
        exercicio11_easy = new Exercicio11_easy();
    }

    @Test
    public void testarSomaDois(){
       Assert.assertEquals(220, exercicio11_easy.somaDois(20));
        

    }
}
