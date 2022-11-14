package Easy;
import javax.swing.JOptionPane;

public class Exercicio10_2_easy {
    public static void main(String[] args) {
        double valorJuros = 0.0, taxaJuros = 0.05, valorInvestimento, valorTotal,ano = 1;
     
        valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para investir:"));
                
        while (ano<=10){
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano ++;

        }

        valorTotal = valorJuros + valorInvestimento;

        JOptionPane.showMessageDialog(null, "Valor Investido: R$"+ valorInvestimento);
        JOptionPane.showMessageDialog(null, "Valor Juros: R$"+ valorJuros);
        JOptionPane.showMessageDialog(null, "Valor Total com Juros: R$"+ valorTotal);
    }
}
