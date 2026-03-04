import java.util.Scanner;

public class Uni3Exe16 {

    // Análise: ok
    // Entradas: valorTotal, valorDado
    // Saída: valorTroco, notas_100, notas_10, notas_1
    // Processo:
    //  int troco = valorDado - valorTotal;
    //  int notas_100 = troco / 100;
    //  int resto = troco % 100;
    //  int notas_10 = resto / 10;
    //  resto = resto % 10;
    //  int notas_1 = resto;
    //  int valorTroco = notas_100 + notas_10 + notas_1;
    // Fluxograma:

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        int valorTotal = leitor.nextInt();

        System.out.print("Digite o valor dado pelo cliente: ");
        int valorDado = leitor.nextInt();

        int troco = valorDado - valorTotal;

        int notas_100 = troco / 100;
        int resto = troco % 100;

        int notas_10 = resto / 10;
        resto = resto % 10;

        int notas_1 = resto;
        int valorTroco = notas_100 + notas_10 + notas_1;

        System.out.println("O número mínimo de notas de troco é: " + valorTroco);

        System.out.println(" Quantidade de notas de 100 necessárias é: " + notas_100 );
        System.out.println(" Quantidade de notas de 10 necessárias é: " + notas_10 );
        System.out.println(" Quantidade de notas de 1 necessárias é: " + notas_1 );

        leitor.close();
    }
}