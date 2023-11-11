import java.util.Scanner;

//        Faça um programa que leia um vetor com dez posições para números inteiros. Crie um segundo vetor,
//        substituindo os valores nulos por 1. Mostre os dois vetores.
public class Atividade21 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int[] vetor01 = new int[10];
        int[] vetor02 = new int[10];

        System.out.println("Insira 10 valores para o vetor: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " +(i + 1)+ "º numero: ");
            vetor01[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (vetor01[i] == 0) {
                vetor02[i] = 1;
            } else {
                vetor02[i] = vetor01[i];
            }
        }

        System.out.println("Primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor01[i] + " ");
        }

        System.out.println("\nVetor com os numeros substituidos:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor02[i] + " ");
        }

        entrada.close();
    }
}