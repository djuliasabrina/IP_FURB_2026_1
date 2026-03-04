import java.util.Scanner;

public class Uni3Exe08 {

    // Análise: ok
    // Entradas: valorDolar
    // Saída: reais
    // Processo: reais = valorDolar * 5.65
    // Fluxograma:

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de dólares: ");
        float valorDolar = leitor.nextFloat();

        float reais = valorDolar * 5.65f;
        System.out.print("O atendente deve devolver R$" + reais + " para o cliente.");

        leitor.close();
    }
}