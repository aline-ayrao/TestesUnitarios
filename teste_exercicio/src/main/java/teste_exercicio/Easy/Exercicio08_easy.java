package Easy;
import javax.swing.JOptionPane;

public class Exercicio08_easy {
  public static void main(String[] args) {
    Double sal, impRend=0.0, salLiq=0.0;
    sal = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario"));

    if (sal <= 1903.98) {
      impRend = 0.0;
      salLiq = sal - impRend;
    }

    if (sal > 1903.98 && sal < 2826.65) {
      impRend = ((sal * 0.075) - 142.8);
      salLiq = sal - impRend;
    }

    if (sal > 2826.65 && sal < 3751.05) {
      impRend = ((sal * 0.15) - 354.8);
      salLiq = sal - impRend;
    }

    if (sal > 3751.05 && sal < 4664.68) {
      impRend = ((sal * 0.225) - 636.13);
      salLiq = sal - impRend;
    }

    if (sal > 4664.68) {
      impRend = (sal * 0.275) - 869.36;
      salLiq = sal - impRend;
    }
    JOptionPane.showMessageDialog(null,"Seu Salario Bruto será: R$"+ sal);
    JOptionPane.showMessageDialog(null,"Seu Salario Liquido será: R$"+ salLiq);
    JOptionPane.showMessageDialog(null,"Seu Imposto de Renda será: R$"+ impRend);
  }
}