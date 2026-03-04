import java.util.Scanner;

public class Uni03Exe01 {

    // Análise: Será considerado metros
    // Entradas: largura, comprimento
    // Saída: area
    // Processo: area = largura * comprimento
    // Fluxograma:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da largura(metros): ");
        float largura = leitor.nextFloat();
        
        System.out.print("Digite o valor do comprimento(metros): ");
        float comprimento = leitor.nextFloat();

        float area = largura * comprimento;
        System.out.println("Área = " + area + "m²");

        leitor.close();
    }
}
