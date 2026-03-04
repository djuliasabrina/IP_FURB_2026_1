import java.util.Scanner;

public class Uni3Exe11 {

    // Análise: ok
    // Entradas: celsius
    // Saída: fahrenheit
    // Processo: fahrenheit = (celsius * 1.8f) + 32;
    // Fluxograma:

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em °C: ");
        float celsius = leitor.nextFloat();

        float fahrenheit = (celsius * 1.8f) + 32;
        System.out.print("°F: " + fahrenheit);

        leitor.close();
    }
}