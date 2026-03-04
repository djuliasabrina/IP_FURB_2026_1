import java.util.Scanner;

public class Uni3Exe10 {

    // Análise: ok
    // Entradas: cateto1, cateto2
    // Saída: hipotenusa
    // Processo: hipotenusa = (cateto 1 * cateto1) + (cateto2 * cateto2)
    // Processo: resultado = Math.sqrt(hipotenusa)
    // Fluxograma:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o comprimento do cateto 1: ");
        float cateto1 = leitor.nextFloat();

        System.out.print("Digite o comprimento do cateto 2: ");
        float cateto2 = leitor.nextFloat();

        float hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
        double resultado = Math.sqrt(hipotenusa);
        System.out.print("A hipotenusa é: " + resultado);

        leitor.close();

    }
}