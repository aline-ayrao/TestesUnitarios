package Easy;
import org.junit.Assert;
import org.junit.Test;

import teste_exercicio.Easy.Exercicio02_easy;

public class Teste_Exercicio02_easy {
    @Test
    public void testRetornaPalavra(){
        Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        
        Assert.assertEquals("Teste", exercicio02_easy.retornaPalavra("Teste"));
        
    }
}
