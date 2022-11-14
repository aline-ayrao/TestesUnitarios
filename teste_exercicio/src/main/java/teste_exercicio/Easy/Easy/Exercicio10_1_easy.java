package Easy;
import javax.swing.JOptionPane;

public class Exercicio10_1_easy {
    
    public static void main(String[] args) {
       double valorJuros,  taxaJuros = 0.05, valorInvestimento, valorTotal; 

       valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para investir:")); 
       valorJuros = (10*taxaJuros) * valorInvestimento;
       valorTotal = valorJuros + valorInvestimento;

       JOptionPane.showMessageDialog(null, "Valor Investido: R$"+ valorInvestimento);
       JOptionPane.showMessageDialog(null, "Valor Juros: R$"+ valorJuros);
       JOptionPane.showMessageDialog(null, "Valor Total com Juros: R$"+ valorTotal);
    
    }
    
}
