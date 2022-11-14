package Easy;
import javax.swing.JOptionPane;

public class Exercicio05_easy {
    
    public static void main(String[] args) {
        Integer num1, num2, num3;
        String dig1 = JOptionPane.showInputDialog("Digite o primeiro numero");
        String dig2 = JOptionPane.showInputDialog("Digite o segungo numero");
        String dig3 = JOptionPane.showInputDialog("Digite o terceiro numero");

        num1 = Integer.parseInt(dig1);
        num2 = Integer.parseInt(dig2);
        num3 = Integer.parseInt(dig3);

        JOptionPane.showMessageDialog(null,"A soma dos três números digitados é: " +( num1+num2+num3));
        JOptionPane.showMessageDialog(null,"A subtração dos três números digitados é: " +( num1-num2-num3));
        JOptionPane.showMessageDialog(null,"A multiplicação dos três números digitados é: " +( num1*num2*num3));
        JOptionPane.showMessageDialog(null,"A média dos três números digitados é: " +( (num1+num2+num3)/3));
    }
}