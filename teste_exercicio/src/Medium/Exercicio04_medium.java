package Medium;

public class Exercicio04_medium {
    public static void main(String[] args) {
        int i = 1, resultadoMultiplicacao = 1;

        while (i <= 1000) {
            resultadoMultiplicacao = resultadoMultiplicacao * i;
            System.out.println("O resultado da multiplicação é: " + resultadoMultiplicacao);

            if (resultadoMultiplicacao >= 1000) {
                resultadoMultiplicacao = 1;

            }
            i++;
        }
    }
}
