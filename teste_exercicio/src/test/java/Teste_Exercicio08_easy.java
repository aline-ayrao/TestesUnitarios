import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

import org.junit.Assert;

import teste_exercicio.Easy.Exercicio08_easy;

public class Teste_Exercicio08_easy {
    static Exercicio08_easy exercicio08_easy;
    static DecimalFormat df = new DecimalFormat("#,###.00");

    @BeforeClass
    public static void before(){
        exercicio08_easy = new Exercicio08_easy();
    }

    @Test
    public void testarPrimeiroIf(){

        String valorEsperado = ",00";
        String valorAtual = df.format(exercicio08_easy.calculaImpostoRenda(1903.98));
        Assert.assertEquals(valorEsperado, valorAtual.toString());
    }
    @Test
    public void testarSegundoIf(){
        String valorEsperado = "44,70";
        String valorAtual = df.format(exercicio08_easy.calculaImpostoRenda(2500.00));
        Assert.assertEquals(valorEsperado, valorAtual.toString());
    }
    @Test
    public void testarTerceiroIf(){
        String valorEsperado = "170,20";
        String valorAtual = df.format(exercicio08_easy.calculaImpostoRenda(3500.00));
        Assert.assertEquals(valorEsperado, valorAtual.toString());
    }
    @Test
    public void testarQuartoIf(){
        String valorEsperado = "207,86";
        String valorAtual = df.format(exercicio08_easy.calculaImpostoRenda(3751.05));
        Assert.assertEquals(valorEsperado, valorAtual.toString());
    }
    @Test
    public void testarQuintoIf(){
        String valorEsperado = "643,14";
        String valorAtual = df.format(exercicio08_easy.calculaImpostoRenda(5500.00));
        Assert.assertEquals(valorEsperado, valorAtual.toString());
    }
}
