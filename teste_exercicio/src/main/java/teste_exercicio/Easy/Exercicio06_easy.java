package Easy;
import javax.swing.JOptionPane;

public class Exercicio06_easy {
    public static void main(String[] args) {
        double nota1, nota2, resultado;
        String nota1Stg, nota2Stg;
        nota1Stg = JOptionPane.showInputDialog("Por Favor Digite a primeira nota");
        nota2Stg = JOptionPane.showInputDialog("Por Favor Digite a segunda nota");

        nota1 = Integer.parseInt(nota1Stg);
        nota2 = Integer.parseInt(nota2Stg);
        resultado = (nota1 + nota2)/2;
        JOptionPane.showMessageDialog(null,"Seu resultado foi:" + resultado);

        if(resultado > 5){
            JOptionPane.showMessageDialog(null,"Aprovado");
        } // fim se

        if(resultado < 5){
            JOptionPane.showMessageDialog(null,"Reprovado");
        }// fim se

        if (resultado == 5){
            JOptionPane.showMessageDialog(null,"Exame");
        }//fim se     
    } // fim metodo main
} //fim da classe
