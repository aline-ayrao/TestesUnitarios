package teste_exercicio.Medium;

public class Exercicio01_medium {
    public void exibeParOuImpar() {
        int i=0;

        while (i<=100) {
            if (i%2 == 0) {
                System.out.println("O numero: "+ i +" É par!");
            } else{
                System.out.println("O numero: "+ i + " É impar!");
            }
        i++;
        }
    }
    
}
