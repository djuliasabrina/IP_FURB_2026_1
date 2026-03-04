import java.util.Scanner;

public class Uni3Exe02 {

    // Análise: ok
    // Entradas: valorInicial
    // Saída: desconto, valorFinal
    // Processo: desconto = valorInicia * 0.12
    // Processo: valorFinal = valorInicial - desconto
    // Fluxograma:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do par de sapatos: ");
        float valorInicial = leitor.nextFloat();

        float desconto = valorInicial * 0.12f;
        System.out.println("O valor do desconto é de R$: " + desconto);

        float valorFinal = valorInicial - desconto;
        System.out.println("O preço do par de sapatos com desconto é R$: " + valorFinal);

        leitor.close();

    }
}
