import java.util.Scanner;

// Análise: ok
// Entradas: distancia, tempo
// Saída: velocidadeMedia, qtdLitros
// Processo: 
// float velocidadeMedia = distancia / tempo;
// double qtdLitros = distancia / 12f;
// Fluxograma:

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a distância percorrida: ");
        float distancia = leitor.nextFloat();

        System.out.print("Digite o tempo gasto: ");
        float tempo = leitor.nextFloat();

        float velocidadeMedia = distancia / tempo;
        double qtdLitros = distancia / 12f;

        System.out
                .print("A velocidade média foi de " + velocidadeMedia + " km/h e a quantidade de combustível usado foi "
                        + qtdLitros + " litros.");

        leitor.close();
    }
}