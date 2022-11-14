package teste_exercicio.Easy;

public class Exercicio07_easy {

    public String calculaInss(Double sal) {
        Double inss=0.0;

        if (sal <= 1045.00) {
            inss = sal * 0.075; //7,5%
        }

        if (sal >= 1045.00 && sal <= 2089.60) {
            inss = sal * 0.09; //9%
        }

        if (sal >= 2089.60 && sal <= 3134.40) {
            inss = sal * 0.12; //12%
        }

        if (sal >= 3134.40 && sal <= 6101.06) {
            inss = sal * 0.14; //14%
        }

        if (sal > 6101.06) {
            inss = 854.15; 
        }
        return "O Valor do Inss a ser pago é R$ "+ inss;
    }
}