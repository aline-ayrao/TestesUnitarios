package Medium;

import javax.swing.JOptionPane;

public class Exercicio09_medium {
    public static void main(String[] args) {
        String [] alunoVetor;
        double [] numeroAlunosVetor;
        int i=0;
        alunoVetor = new String[7];
        numeroAlunosVetor = new double [7];
        while (i<7) {
            alunoVetor[i]= JOptionPane.showInputDialog("Nome Digitado");
            numeroAlunosVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Numero do aluno digitado"));
            i++;
        }
        i=0;
        while (i<7) {
            System.out.println("Nome do Aluno: "+alunoVetor[i]+ " - "+"Numero do Aluno: "+numeroAlunosVetor[i]);
            i++;
        }
    }
}
