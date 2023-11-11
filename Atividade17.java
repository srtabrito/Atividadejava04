import java.util.Arrays;

//Faça um programa que preencha dois vetores de dez posições cada, determine e mostre um terceiro
// contendo os elementos dos dois vetores anteriores ordenados de maneira decrescente.
public class Atividade17 {
    public static void main(String[] args) {

        int tamanho = 10;
        int[] vetor01 = new int[tamanho];
        int[] vetor02 = new int[tamanho];

        int i, tam;

        Arrays.sort(vetor01);
        Arrays.sort(vetor02);

        for (i  = 0; i < tamanho; i++) {
            vetor01[i] = i + 1;
            vetor02[i] = tamanho - i;

        }

        int[] vetorDecre = new int[2 * tamanho];
        for (i = 0; i < tamanho; i++) {
            System.arraycopy(vetor01, 0, vetorDecre, 0, tamanho);
            System.arraycopy(vetor02, 0, vetorDecre, tamanho, tamanho);
        }

        Arrays.sort(vetorDecre);

        for (i = 0; i < tamanho; i++) {
            tam = vetorDecre[i];
            vetorDecre[i] = vetorDecre[2 * tamanho - 1 - i];
            vetorDecre[2 * tamanho - 1 - i] = tam;
        }

        System.out.println("Terceiro vetor em ordem decrescente: ");
        for (i = 0; i < 2 * tamanho; i++) {
            System.out.println(vetorDecre[i] + " ");
        }


    }
}