package teste_exercicio.Easy;

public class Exercicio06_easy {
    public String verificaAprovacao(double nota1, double nota2) {
        double resultado;
        resultado = (nota1 + nota2)/2;
        if(resultado > 5){
        return "Aprovado";
        } // fim se

        if(resultado >= 0 && resultado < 5){
            return"Reprovado";
        }// fim se

        if (resultado == 5){
            return"Exame";
        }//fim se   
        return "Nota não calculada";  
    } // fim metodo main
} //fim da classe
