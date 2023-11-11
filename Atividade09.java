import java.util.Scanner;

//        Faça um programa que preencha três vetores com dez posições cada um: o primeiro vetor, com os nomes de
//        dez produtos; o segundo vetor, com os códigos dos dez produtos; e o terceiro vetor, com os preços dos produtos. Mostre um relatório apenas com o nome, o código, o preço e o novo preço dos produtos que sofrerão
//        aumento.
//        Sabe-se que os produtos que sofrerão aumento são aqueles que possuem código par ou preço superior a
//        R$ 1.000,00. Sabe-se ainda que, para os produtos que satisfazem as duas condições anteriores, código e
//        preço, o aumento será de 20%; para aqueles que satisfazem apenas a condição de código, o aumento será
//        de 15%; e para aqueles que satisfazem apenas a condição de preço, o aumento será de 10%.
public class Atividade09 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        String[] nomeProduto = new String[10];
        int[] codigoProduto = new int[10];
        double[] precoProduto = new double[10];

        double novoPreco = 0;
        int i;

        for (i  = 0; i < 10; i++) {
            System.out.print("Informe o nome do produto: ");
            nomeProduto[i] = entrada.nextLine();
            System.out.print("Informe codigo do produto: ");
            codigoProduto[i] = entrada.nextInt();
            System.out.print("Informe o preço: R$");
            precoProduto[i] = entrada.nextDouble();
            entrada.nextLine();

        }

        for ( i = 0; i < 10; i++) {
            novoPreco = precoProduto[i];

            if (codigoProduto[i] % 2 == 0) {
                novoPreco *= 1.20;
            }

            if (precoProduto[i] > 1000) {
                novoPreco *= 1.10;
            }

            if (codigoProduto[i] % 2 != 0 && precoProduto[i] <= 1000) {
                novoPreco *= 1.15;
            }

            if (novoPreco != precoProduto[i]) {
                System.out.println(nomeProduto[i] + "\t" + codigoProduto[i] + "\t" + precoProduto[i] + "\t" + novoPreco);
            }
        }

        entrada.close();
    }
}