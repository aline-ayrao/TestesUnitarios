package Easy;
import org.junit.Assert;
import org.junit.Test;

import teste_exercicio.Easy.Exercicio03_easy;

public class Teste_Exercicio03_easy {
    @Test
    public void testeRetornaValorTrocado(){
        Exercicio03_easy exercicio03_easy = new Exercicio03_easy();

        String mensagemEsperada = "O primeiro valor digitado foi: segundoValor\nO segundo valor digitado foi: primeiroValor";
        String mensagemAtual = exercicio03_easy.retornaValorTrocado("primeiroValor", "segundoValor");

        Assert.assertEquals(mensagemEsperada, mensagemAtual);

    }
}
