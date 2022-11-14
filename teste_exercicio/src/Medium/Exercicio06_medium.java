package Medium;

import javax.swing.JOptionPane;

public class Exercicio06_medium {
    public static void main(String[] args) {
        int fatorial, i;
        fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        i=fatorial;
        while (i>1) {
            fatorial = fatorial*(i-1);
            i--;            
        }
        System.out.println("O fatorial do numero digitado é:"+fatorial);
    }
}
