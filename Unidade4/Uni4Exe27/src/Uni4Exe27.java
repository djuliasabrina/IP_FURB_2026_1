import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Hora Chegada: ");
        int horaChegada = leitor.nextInt();
        System.out.println("Minuto Chegada: ");
        int minChegada = leitor.nextInt();
        System.out.println("Hora Saída: ");
        int horaSaida = leitor.nextInt();
        System.out.println("Minuto Saída: ");
        int minSaida = leitor.nextInt();

        int chegadaMin = horaChegada * 60 + minChegada;
        int saidaMin = horaSaida * 60 + minSaida;

        if (horaChegada > 23 || horaChegada < 00 || horaSaida > 23 || horaSaida < 00 || minChegada > 59
                || minChegada < 0 || minSaida > 59 || minSaida < 0) {
            System.out.println("Horário inválido.");
        }

        int tempoTotal = saidaMin - chegadaMin;

        if (saidaMin <= chegadaMin) {
            System.out.println("Horário de saída deve ser maior que o de chegada.");
        }

        int horas = tempoTotal / 60;
        int minutos = tempoTotal % 60;

        if (horas == 0 && minutos < 30) {
            horas = 1;
        } else if (minutos >= 30) {
            horas++;
        }

        double preco = 0.00;

        switch (horas) {
            case 1:
                preco = 5.0;
                break;

            case 2:
                preco = 10.0;
                break;

            case 3:
                preco = 17.50;
                break;

            case 4:
                preco = 25;
                break;

            default:
                preco = 25.0 + (horas - 4) * 10.0;
                break;
        }

        System.out.println("Preço cobrado = R$" + df.format(preco));

        leitor.close();
    }
}
