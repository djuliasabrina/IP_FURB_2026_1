import java.util.Scanner;

public class Uni3Exe10 {

    // Análise: ok
    // Entradas: cateto1, cateto2
    // Saída: hipotenusa
    // Processo: hipotenusa = (catetoOposto * catetoOposto) + (catetoAdjacente * catetoAdjacente)
    // Processo: resultado = Math.sqrt(hipotenusa)
    // Fluxograma:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o comprimento do cateto oposto: ");
        float catetoOposto = leitor.nextFloat();

        System.out.print("Digite o comprimento do cateto adjacente: ");
        float catetoAdjacente = leitor.nextFloat();

        float hipotenusa = (catetoOposto * catetoOposto) + (catetoAdjacente * catetoAdjacente);
        double resultado = Math.sqrt(hipotenusa);
        System.out.print("A hipotenusa é: " + resultado);

        leitor.close();

    }
}