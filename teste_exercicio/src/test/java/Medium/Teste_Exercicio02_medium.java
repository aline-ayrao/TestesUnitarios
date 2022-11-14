package Medium;
import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Medium.Exercicio02_medium;

public class Teste_Exercicio02_medium {
    static Exercicio02_medium exercicio02_medium;
    static DecimalFormat df = new DecimalFormat("#,###.00");

    @BeforeClass
    public static void before(){
        exercicio02_medium = new Exercicio02_medium();
    }
    
    @Test
    public void testeCalculaJurosCompostos(){
        
        String valorEsperado = "943,34";
        String valorAtual = df.format(exercicio02_medium.calculaInvestimentoJurosCompostos(1500.00));

        Assert.assertEquals(valorEsperado, valorAtual);
    }
    @Test
    public void testeCalculaValorInvestimento(){
        
        String valorEsperado = "2.128,89";
        String valorAtual = df.format(exercicio02_medium.calculaValorTotalInvestimento(1500.00, 628.89));

        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
