package teste_exercicio.Medium;

import javax.swing.JOptionPane;

public class Exercicio09_medium {
    public void nomeNumeroAlunos() {

        int i = 0;
        String[] alunoVetor = new String[5];
        int[] numeroAlunosVetor = new int[5];

        while (i < 5) {
            alunoVetor[i] = recebeAluno();
            numeroAlunosVetor[i] = recebeNumeroAluno();
            i++;
        }
        imprimeNomeNumero(alunoVetor, numeroAlunosVetor);
    }

    private void imprimeNomeNumero(String[] vetorNome, int[] vetorNumeros) {

        int i = 0;
        while (i < 5) {
            System.out.println("Nome do Aluno: " + vetorNome[i] + " - " + "Numero do Aluno: " + vetorNumeros[i]);
            i++;
        }
    }

    private int recebeNumeroAluno() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do Aluno"));
    }

    private String recebeAluno() {
        return JOptionPane.showInputDialog("Digite o nome do Aluno");
    }
}
