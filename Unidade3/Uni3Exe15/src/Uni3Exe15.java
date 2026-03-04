import java.util.Scanner;

public class Uni3Exe15 {

    // Análise: ok
    // Entradas: numero
    // Saída: centena, dezena, unidade
    // Processo:
    //    int centena = numero / 100;
    //    int dezena = (numero % 100) / 10;
    //    int unidade = numero % 10;
    // Fluxograma:

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro (assuma até 3 dígitos): ");
        int numero = leitor.nextInt();

        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;

        System.out.print(centena + " centena(s) " + dezena + " dezena(s) " + unidade +" unidade(s)");

        leitor.close();
    }
}