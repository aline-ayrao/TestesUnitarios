package Easy;
import javax.swing.JOptionPane;

public class Exercicio11_easy {
    public static void main(String[] args) {
        int numeroDigitado, i = 1;

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        while (i <= 100) {
            numeroDigitado = numeroDigitado + 2;

            JOptionPane.showMessageDialog(null, "O total somado é: " + numeroDigitado);
            i++;
        }
    }
}
