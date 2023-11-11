import java.util.Scanner;

//        Faça um programa que preencha um vetor com os nomes de sete alunos e carregue outro vetor com a média
//        final desses alunos. Calcule e mostre:
//        o nome do aluno com maior média (desconsiderar empates);
//        para cada aluno não aprovado, isto é, com média menor que 7, mostrar quanto esse aluno precisa na prova de exame final para ser aprovado. Considerar que a média para aprovação no exame é 5.
public class Atividade08 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        String[] nome = new String[7];
        double[] medias = new double[7];

        double maiorMedia = 0, notaNecessaria;
        int indiceMaiorMedia = 0;


        System.out.println("Informe o nome do aluno");
        System.out.println("Informe a media do aluno");
        for (int i = 0; i < 7; i ++) {
            System.out.println("Informe o " +(i + 1) +"º nome: ");
            nome[i] = entrada.nextLine();

            System.out.println("Informe a " +(i + 1) +"º media: ");
            medias[i] = entrada.nextDouble();
            entrada.nextLine();
        }

        for (int i = 1; i < 7; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                indiceMaiorMedia = i;
            }
        }

        System.out.println("Aluno com a maior média: " + nome[indiceMaiorMedia]);

        for (int i = 0; i < 7; i++) {
            if (medias[i] < 7) {
                notaNecessaria = 5 - medias[i];
                System.out.println(nome[i] + " precisa tirar " + notaNecessaria + " no exame final para ser aprovado.");
            }
        }
        entrada.close();
    }
}