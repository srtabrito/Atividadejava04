import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];

        var entrada = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros para o primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Informe o " +(i + 1) + "º número: ");
            vetor1[i] = entrada.nextInt();
        }

        System.out.println("Digite 5 números inteiros para o segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Informe o " +(i + 1) + "º número: ");
            vetor2[i] = entrada.nextInt();
        }

        int[] resultado02 = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 == 0) {
                for (int j = 0; j < vetor2.length; j++) {
                    resultado02[i] += vetor1[i] + vetor2[j];
                }
            }
        }

        int[] resultado = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 != 0) {
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor2[j] != 0 && vetor1[i] % vetor2[j] == 0) {
                        resultado[i]++;
                    }
                }
            }
        }

        System.out.println("Primeiro vetor resultante:");
        for (int i : resultado02) {
            System.out.print(i + " ");
        }

        System.out.println("\nSegundo vetor resultante:");
        for (int i : resultado) {
            System.out.print(i + " ");
        }

        entrada.close();
    }
}