import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import teste_exercicio.Easy.Exercicio05_easy;

public class Teste_Exercicio05_easy_Before {
    static Exercicio05_easy exercicio05_easy;

    @BeforeClass
    public static void before(){
        exercicio05_easy = new Exercicio05_easy();
    }
    public class Teste_Exercicio05_easy {
        @Test
        public void testeSoma (){
            Assert.assertEquals(6, exercicio05_easy.soma(2, 2, 2));
        }
        @Test
        public void testeSubtracao (){
            Assert.assertEquals(-2, exercicio05_easy.subtracao(2, 2, 2));
        }
        @Test
        public void testeMultiplicacao (){
            Assert.assertEquals(8, exercicio05_easy.multiplicacao(2, 2, 2));
        }
        @Test
        public void testeMedia (){
            int soma = exercicio05_easy.soma(2, 2, 2);
            Assert.assertEquals(2, exercicio05_easy.media(soma));
        }
    }
}
