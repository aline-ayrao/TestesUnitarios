import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Easy.Exercicio06_easy;

public class Teste_Exercicio06_easy {

    static Exercicio06_easy exercicio06_easy;

    @BeforeClass
    public static void before() {
        exercicio06_easy = new Exercicio06_easy();
    }

    @Test
    public void testeAprovado() {
        String mensagemEsperada = "Exame";
        String mensagemAtual = exercicio06_easy.verificaAprovacao(7, 3);

        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }
    
}
