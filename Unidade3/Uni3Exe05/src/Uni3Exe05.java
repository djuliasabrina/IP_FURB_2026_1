import java.util.Scanner;

    // Análise: ok
    // Entradas: qtdFrango
    // Saída: gasto
    // Processo: gasto = (qtdFrango * 4) + (qtdFrango * 7)
    // Fluxograma:

public class Uni3Exe05{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de frangos: ");
        int qtdFrango = leitor.nextInt();

        float gasto = (qtdFrango * 4) + (qtdFrango * 7);
        System.out.print("O gasto total para marcar " + qtdFrango + " é R$" + gasto);

        leitor.close();
    }
}