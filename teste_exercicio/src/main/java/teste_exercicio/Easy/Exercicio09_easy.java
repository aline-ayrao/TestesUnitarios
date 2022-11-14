package teste_exercicio.Easy;
import javax.swing.JOptionPane;

public class Exercicio09_easy {
    public Integer calculaTabuada (Integer numeroDigitado, Integer resultado) {
        int i = 1;

        while (i <= 10) {
            resultado = numeroDigitado * i;
            JOptionPane.showMessageDialog(null, numeroDigitado + " X " + i + " = " + resultado);
            i = i + 1;
        }
        return resultado;

    }

}

