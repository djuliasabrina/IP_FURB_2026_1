import java.util.Scanner;

public class Uni3Exe04{

    // Análise: ok
    // Entradas: nota1, nota2, nota3
    // Saída: media
    // Processo: media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10
    // Fluxograma:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        float nota1 = leitor.nextFloat();

        System.out.print("Digite a nota 2: ");
        float nota2 = leitor.nextFloat();

        System.out.print("Digite a nota 3: ");
        float nota3 = leitor.nextFloat();

        float media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;
        System.out.print("A média ponderada das notas é " + media);

        leitor.close();
    }
}
