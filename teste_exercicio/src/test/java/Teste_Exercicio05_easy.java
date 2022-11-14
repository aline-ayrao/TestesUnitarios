import org.junit.Assert;
import org.junit.Test;

import teste_exercicio.Easy.Exercicio05_easy;

public class Teste_Exercicio05_easy {
    @Test
    public void testeSoma (){
        Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
        Assert.assertEquals(6, exercicio05_easy.soma(2, 2, 2));
    }
}
