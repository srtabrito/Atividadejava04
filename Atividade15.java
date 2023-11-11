import java.util.Scanner;

//        Faça um programa que receba o nome de oito clientes e armazene-os em um vetor. Em um segundo vetor,
//        armazene a quantidade de DVDs locados em 2011 por cada um dos oito clientes. Sabe-se que, para cada
//        dez locações, o cliente tem direito a uma locação grátis. Faça um programa que mostre o nome de todos
//        os clientes, com a quantidade de locações grátis a que ele tem direito.
public class Atividade15 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        String[] clientes = new String[8];
        int[] locacoes2011 = new int[8];
        int[] locacoesGratis = new int[8];

        System.out.println("Digite o nome de oito clientes e a quantidade de DVDs locados em 2011 para cada um:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Nome do cliente " + (i + 1) + ": ");
            clientes[i] = entrada.nextLine();
            System.out.print("Quantidade de DVDs locados em 2011: ");
            locacoes2011[i] = entrada.nextInt();

            locacoesGratis[i] = locacoes2011[i] / 10;
            entrada.nextLine();

            System.out.println();
        }

        System.out.println("Relatorio de locações gratis");

        for (int i = 0; i < 8; i++) {
            System.out.println(clientes[i] + " tem direito a " + locacoesGratis[i] + " locações grátis.");
        }


        entrada.close();
    }
}