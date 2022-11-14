package Easy;
import javax.swing.JOptionPane;

public class Exercicio04_easy {
    public static void main(String[] args) {
        Integer numeroDigitado=0, resultado;
        String valorDigitado;
        valorDigitado = JOptionPane.showInputDialog("Digite um numero");
        numeroDigitado = Integer.parseInt(valorDigitado);
        resultado = numeroDigitado * 2;
        //System.out.println("O dobro do numero digitado é: "+resultado);
        JOptionPane.showMessageDialog(null,"O dobro do numero digitado é: "+resultado);
    }
}
