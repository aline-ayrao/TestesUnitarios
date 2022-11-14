package teste_exercicio.Medium;

import javax.swing.JOptionPane;

public class Exercicio05_medium {
    public int exibeMenorNumero() {
        int menorNumero = 0, i = 1;
        while (i <= 5) {
            int numeroDigitado = lerNumeroDigitado();

            if (numeroDigitado < menorNumero || i == 1) {
                menorNumero = numeroDigitado;
            }
            i++;
        }
        return menorNumero;

    }

    private int lerNumeroDigitado() {
        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

        return numeroDigitado;
    }
}
