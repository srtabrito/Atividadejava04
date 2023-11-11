import java.util.Random;
import java.util.Scanner;

public class Atividade03 {
public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    System.out.flush();

    var entrada = new Scanner(System.in);
    Random aleatorio = new Random();
    int[] codigo;
    int[] total;
    codigo = new int[10];
    total = new int[10];
    boolean existe = false;
    int codProd = 0;

    int cliente, produto = 0, quantidade = 0;

    for (int i = 0; i <= 9; i++) {
        codigo[i] = aleatorio.nextInt(1000) + 1;
        total[i] = aleatorio.nextInt(1000) + 1;
    }

    do {
        System.out.print("Insira código do cliente: ");
        cliente = entrada.nextInt();
        if (cliente > 0) {
            System.out.println("Códigos dos produtos: ");
            for (int i = 0; i <= 9; i++) {
                System.out.println(codigo[i]);
            }
            System.out.print("Insira código do produto: ");
            produto = entrada.nextInt();
            for (int i = 0; i < total.length; i++) {
                if (produto == codigo[i]) {
                    existe = true;
                    codProd = i;
                }
            }
            if (existe){
                System.out.println("Quantidade dos produtos: ");
                System.out.println(total[codProd]);
                System.out.print("Insira quantidade desejada: ");
                quantidade = entrada.nextInt();
                if (quantidade <= total[codProd]) {
                    System.out.println("Pedido atendido. Obrigado e volte sempre!");
                    total[codProd] -= quantidade;
                } else {
                    System.out.println("Não temos estoque suficiente dessa mercadoria.");
                }
            } else {
                System.out.println("Código inexistente");
            }

        }
    } while (cliente > 0);

    for (int i = 0; i <= 9; i++) {
        System.out.println("Código: " + codigo[i] + " - Total: " + total[i]);
    }
      entrada.close();
    }
}