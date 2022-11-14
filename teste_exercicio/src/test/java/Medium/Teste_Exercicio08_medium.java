package Medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Medium.Exercicio08_medium;

public class Teste_Exercicio08_medium {
    static Exercicio08_medium exercicio08_medium;
    static String []vetorMesesEsperado;
    
    @BeforeClass
    public static void before() {
        exercicio08_medium = new Exercicio08_medium();
            vetorMesesEsperado = new String [12];
            
            vetorMesesEsperado[0] = "Janeiro";
            vetorMesesEsperado[1] = "Fevereiro";
            vetorMesesEsperado[2] = "Março";
            vetorMesesEsperado[3] = "Abril";
            vetorMesesEsperado[4] = "Maio";
            vetorMesesEsperado[5] = "Junho";
            vetorMesesEsperado[6] = "Julho";
            vetorMesesEsperado[7] = "Agosto";
            vetorMesesEsperado[8] = "Setembro";
            vetorMesesEsperado[9] = "Outubro";
            vetorMesesEsperado[10] = "Novembro";
            vetorMesesEsperado[11] = "Dezembro";
    }
    @Test
    public void testeCriaVetorMeses() {
     
     Assert.assertArrayEquals(vetorMesesEsperado,exercicio08_medium.criaVetorMeses());

    }
    @Test
    public void testeImprimeVetorMeses() {
     
     exercicio08_medium.imprimeValoresVetor(vetorMesesEsperado);

    }
}
