package Easy;
import javax.swing.JOptionPane;

public class Exercicio09_easy {
    public static void main(String[] args) {
        Integer numeroDigitado, i = 1, resultado;
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para calcular a tabuada:"));
        while (i <= 10) {
            resultado = numeroDigitado * i;
            JOptionPane.showMessageDialog(null, numeroDigitado + " X " + i + " = " + resultado);
            i = i + 1;
        }

    }

}
