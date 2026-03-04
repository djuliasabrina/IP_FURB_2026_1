import java.util.Scanner;

public class Uni3Exe09 {

    // Análise: ok
    // Entradas: raio, altura
    // Saída: volume
    // Processo: volume = 3.14f * (raio * raio) * altura
    // Fluxograma:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        float raio = leitor.nextFloat();

        System.out.print("Digite o valor da altura: ");
        float altura = leitor.nextFloat();

        float volume = 3.14f * (raio * raio) * altura;
        System.out.print("O volume da lata de óleo é: " + volume);

        leitor.close();
    }
}