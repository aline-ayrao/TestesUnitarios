package teste_exercicio.Easy;

public class Exercicio07_easy {

    public double calculaInss(double sal) {
        double inss=0.0;

        if (sal <= 1045.00) {
            inss = sal * 0.075; //7,5%
        }

        if (sal >= 1045.01 && sal <= 2089.60) {
            inss = sal * 0.09; //9%
        }

        if (sal >= 2089.61 && sal <= 3134.40) {
            inss = sal * 0.12; //12%
        }

        if (sal >= 3134.41 && sal <= 6101.06) {
            inss = sal * 0.14; //14%
        }

        if (sal > 6101.07) {
            inss = 854.15; 
        }
        return inss;
    }
}