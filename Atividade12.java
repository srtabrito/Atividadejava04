import java.util.Scanner;

//Faça um programa que receba cinco números e mostre a saída a seguir:
//        Digite o 1º número 5
//        Digite o 2º número 3
//        Digite o 3º número 2
//        Digite o 4º número 0
//        Digite o 5º número 2
//        Os números digitados foram: 5 + 3 + 2 + 0 + 2 = 12
public class Atividade12 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int[] num = new int[5];
        int soma = 0;

        System.out.println("Informe 5 numeros inteiros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe " +(i + 1)+ " numero: ");
            num[i] = entrada.nextInt();
            soma += num[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(num[i]);
            if (num[i] < 5) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + soma);


        entrada.close();
    }
}