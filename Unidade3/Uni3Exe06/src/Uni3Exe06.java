import java.util.Scanner;

public class Uni3Exe06 {

    // Análise: ok
    // Entradas: peso
    // Saída: valorPagamento
    // Processo: valorPagamento = (peso - 0.750) * 25
    // Fluxograma:

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o peso do prato montado pelo cliente (em quilos): ");
        float peso = leitor.nextFloat();

        float valorPagamento =  (peso - 0.750f) * 25;
        System.out.print("O valor do prato do cliente é R$" + valorPagamento);

        leitor.close();
    }
}