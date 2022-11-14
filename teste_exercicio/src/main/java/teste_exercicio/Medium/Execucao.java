

package  Medium ;

import  javax . balanço . JOptionPane ;

public  class  Execução {
    public  static  void  main ( String [] args ) {
        // Exercicio01_medium exercicio01_medium = new Exercicio01_medium();
        // exercicio01_medium.exibeParOuImpar();

        // Exercicio02_medium exercicio02_medium = new Exercicio02_medium();
        // double valorInvestimento =
        // Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
        // double valorJuros, valorTotal;
        // valorJuros =
        // exercicio02_medium.calculaInvestimentoJurosCompostos(valorInvestimento);
        // valorTotal =
        // exercicio02_medium.calculaValorTotalInvestimento(valorInvestimento,valorJuros);

        // System.out.println("O valor do investimento é: R$"+ valorInvestimento);
        // System.out.println("O valor dos juros é: R$"+(valorJuros));
        // System.out.println("O valor total do investimento: R$"+ (valorJuros +
        // valorInvestimento));

        // Exercicio03_medium exercicio03_medium = new Exercicio03_medium();
        // exercicio03_medium.somaNumerosAcumulados();

        // Exercicio04_medium exercicio04_medium = new Exercicio04_medium();
        // exercicio04_medium.multiplicacaoNumerosAteMil();

        // Exercicio05_medium exercicio05_medium = new Exercicio05_medium();
        // int menorNumero = exercicio05_medium.exibeMenorNumero();
        // System.out.println("O numero: " + menorNumero + " é o menor.");

        // Exercicio06_medium exercicio06_medium = new Exercicio06_medium();
        // int fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        // System.out.println("O fatorial do numero digitado é:" + (exercicio06_medium.calculaFatorial(fatorial)));

        // Exercicio08_medium exercicio08_medium = new Exercicio08_medium();
        // exercicio08_medium.criaVetorMeses();
        // exercicio08_medium.imprimeValoresVetor(exercicio08_medium.criaVetorMeses());

        
        // Exercicio09_medium exercicio09_medium = new Exercicio09_medium();
        // exercicio09_medium.nomeNumeroAlunos();

    
        Exercicio10_medium  exercicio10_medium = new  Exercicio10_medium ();
        int  elementoFibonacci = Integer . parseInt ( JOptionPane . showInputDialog ( "Digite um numero:" ));
        int [] vetorFibonacci = exercicio10_medium . calcularTermoFibonacci ( elementoFibonacci );
        exercicio10_medium . imprimeVetor ( vetorFibonacci );

    }
}
