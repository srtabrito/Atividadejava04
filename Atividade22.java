import java.util.Scanner;

//        Faça um programa que leia um vetor A de dez posições. Em seguida, compacte o vetor, retirando os
//        valores nulos e negativos. Armazene esse resultado no vetor B. Mostre o vetor B. (Lembre-se: o vetor B
//        pode não ser completamente preenchido.)
public class Atividade22 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int tam = 10, cont = 0;
        int[] vetorA = new int[tam];
        int[] vetorB = new int[tam];

        System.out.println("Preencha o primeiro vetor: ");
        for (int i = 0; i < tam; i++) {
            System.out.print("Informe o " +(i + 1)+ " numero: ");
            vetorA[i] = entrada.nextInt();
        }

        for (int i = 0; i < tam; i++) {
            if (vetorA[i] > 0) {
                vetorB[cont] = vetorA[i];
                cont++;
            }
        }


        System.out.println("Imprimindo o vetor B: ");
        for (int i = 0; i < cont; i++) {
            System.out.print(vetorB[i] + " ");
        }

        entrada.close();
    }
}