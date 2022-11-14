package Easy;
import org.junit.Assert;
import org.junit.Test;

import teste_exercicio.Easy.Exercicio04_easy;

public class Teste_Exercicio04_easy {
    @Test
    public void testeCalcularDobro(){
        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        Assert.assertEquals(20, exercicio04_easy.calcularDobro(10));
    }
}
