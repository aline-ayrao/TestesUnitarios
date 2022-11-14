package Medium;

import javax.swing.JOptionPane;

public class Exercicio02_medium {
    public static void main(String[] args) {
        double valorInvestimento, taxaJuros = 0.05, totalAtualizadoComJuros;
        int ano=1, tempoInvestido = 10;

        valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        totalAtualizadoComJuros = valorInvestimento;

        while (ano<=tempoInvestido) {
            totalAtualizadoComJuros = (totalAtualizadoComJuros*taxaJuros)+totalAtualizadoComJuros;
            ano++;
        }
        System.out.println("O valor do investimento é: R$"+valorInvestimento);
        System.out.println("O valor do juros é: R$"+(totalAtualizadoComJuros - valorInvestimento));
        System.out.println("O valor total do investimento: R$"+totalAtualizadoComJuros);
    }
}
