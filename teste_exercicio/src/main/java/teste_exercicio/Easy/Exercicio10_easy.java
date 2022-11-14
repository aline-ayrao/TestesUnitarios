package teste_exercicio.Easy;

public class Exercicio10_easy {
    public double calculaInvestimento (double valorInvestimento) {
        double valorJuros = 0.0, taxaJuros = 0.05, ano = 1;
        valorInvestimento=1000.00;
                
        while (ano<=10){
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano ++;
        }
        return valorJuros;

    }
}
