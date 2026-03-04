import java.util.Scanner;

public class Uni3Exe07 {

    // Análise: ok
    // Entradas: lata, garrafa600, garafa2000
    // Saída: qtdLitros
    // Processo: qtdLitros = ((lata * 0.350) + (garrafa600 * 0.600) + (garrafa2000 *
    // 2000))
    // Fluxograma:

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de latas de 350ml: ");
        int lata = leitor.nextInt();

        System.out.print("Digite a quantidade de garrafas de 600ml: ");
        int garrafa600 = leitor.nextInt();

        System.out.print("Digite a quantidade de garrafas de 1000ml: ");
        int garrafa2000 = leitor.nextInt();

        int qtdLitros = (lata * 350) + (garrafa600 * 600) + (garrafa2000 * 2000);
        System.out.print("O cliente comprou ao total: " + qtdLitros + " litros");

        leitor.close();
    }
}
