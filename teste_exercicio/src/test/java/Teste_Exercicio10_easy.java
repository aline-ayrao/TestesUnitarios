import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Easy.Exercicio10_2_easy;

public class Teste_Exercicio10_02_easy {

    static Exercicio10_2_easy exercicio10_2_easy;
    static DecimalFormat df = new DecimalFormat("#,###.00");

    @BeforeClass
    public static void before() {
        exercicio10_2_easy = new Exercicio10_2_easy();
    }

    @Test
    public void testeValorInvestimento(){
        String valorEsperado = "500,00";
        String valorAtual = df.format(exercicio10_2_easy.calculaInvestimento(2000.00));
        Assert.assertEquals(valorEsperado,valorAtual);

    }
}
