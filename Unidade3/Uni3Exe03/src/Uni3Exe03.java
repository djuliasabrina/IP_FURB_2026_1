import java.util.Scanner;

public class Uni3Exe03{

    // Análise: ok
    // Entradas: valorGasolina, valorPagamento
    // Saída: litros
    // Processo: litros = valorPagamento / valorGasolina
    // Fluxograma:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina: ");
        float valorGasolina = leitor.nextFloat();

        System.out.print("Digite o valor do pagamento: ");
        float valorPagamento = leitor.nextFloat();

        float litros = valorPagamento / valorGasolina;
        System.out.print("O motorista conseguiu colocar: " + litros + "litros");

        leitor.close();
    }
}