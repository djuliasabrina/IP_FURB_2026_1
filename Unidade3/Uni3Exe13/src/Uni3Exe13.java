import java.util.Scanner;

public class Uni3Exe13 {

    // Análise: ok
    // Entradas: comprimento, altura
    // Saída: valorFinal
    // Processo: 
    // float metros = comprimento * altura;
    // float valorDoMetro = 12.50f * 9f;
    // float valorFinal = metros * valorDoMetro;
    // Fluxograma:

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o comprimento da parede (em metros): ");
        float comprimento = leitor.nextFloat();

        System.out.print("Digite a altura da parede (em metros): ");
        float altura = leitor.nextFloat();

        float metros = comprimento * altura;
        float valorDoMetro = 12.50f * 9f;
        float valorFinal = metros * valorDoMetro;

        System.out.print("O valor final é R$" + valorFinal);

        leitor.close();

    }
}