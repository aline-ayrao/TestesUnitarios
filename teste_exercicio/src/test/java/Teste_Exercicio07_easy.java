import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Easy.Exercicio07_easy;

public class Teste_Exercicio07_easy {

    static Exercicio07_easy exercicio07_easy;
    DecimalFormat df = new DecimalFormat("#,###.00");
    
    @BeforeClass
    public static void before (){
        exercicio07_easy = new Exercicio07_easy();
    }
    @Test
    public void testarPrimeiraFaixa (){

        String valorEsperado = "78,38";
        String valorAtual = df.format(exercicio07_easy.calculaInss(1045.00));
        Assert.assertEquals(valorEsperado, valorAtual);
    }
    @Test
    public void testarSegundaFaixa(){
        String valorEsperado = "94,05";
        String valorAtual = df.format(exercicio07_easy.calculaInss(1045.01));
        Assert.assertEquals(valorEsperado, valorAtual);
    }
    @Test
    public void testarTerceiraFaixa(){
        String valorEsperado = "438,85";
        String valorAtual = df.format(exercicio07_easy.calculaInss(3134.61));
        Assert.assertEquals(valorEsperado, valorAtual);
    }
    
}
