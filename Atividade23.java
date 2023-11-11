import java.util.Scanner;

//        Faça um programa que leia dois vetores (A e B) com cinco posições para números inteiros. O programa
//        deve, então, subtrair o primeiro elemento de A do último de B, acumulando o valor, subtrair o segundo
//        elemento de A do penúltimo de B, acumulando o valor e assim por diante. Ao final, mostre o resultado
//        de todas as subtrações realizadas.
public class Atividade23 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int tam = 5, res = 0;
        int[] vetorA = new int[tam];
        int[] vetorB = new int[tam];

        System.out.println("Insira 5 valores para o vetor A");
        for (int i = 0; i < tam; i++) {
            System.out.print("Informe o " +(i + 1)+ "º numero: ");
            vetorA[i] = entrada.nextInt();
        }

        System.out.println("Insira 5 valores para o vetor B");
        for (int i = 0; i < tam; i++) {
            System.out.print("Informe o " +(i + 1)+ "º numero: ");
            vetorB[i] = entrada.nextInt();
        }

        for (int i = 0; i < tam; i++) {
            res += vetorA[i] - vetorB[4 - i];
        }

        System.out.println("O resultado das subtrações é: " +res);
        entrada.close();
    }
}