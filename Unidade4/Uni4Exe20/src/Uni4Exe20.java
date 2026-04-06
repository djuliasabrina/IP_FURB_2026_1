import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        float notaProva1 = leitor.nextFloat();
        float notaProva2 = leitor.nextFloat();
        float notaProva3 = leitor.nextFloat();
        float notaExercicios = leitor.nextFloat();

        float media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios)/ 7;
        char letra;

        if(media >= 9.0){
            letra = 'A';
        } else if(media >= 7.5 && media < 9.0){
            letra = 'B';
        } else if(media >= 6.0 && media < 7.5){
            letra = 'C';
        } else if(media >= 4.0 && media < 6.0){
            letra = 'D';
        }else{
            letra = 'E';
        }

        if(letra == 'A' || letra == 'B' || letra == 'C'){
        System.out.println("A média de aproveitamento foi: " + df.format(media) + "." + " Conceito: " + letra + "." +   " Aprovado");
        }else{
            System.out.println("A média de aproveitamento foi: " + df.format(media) + "." + " Conceito: " + letra + "." +   " Reprovado");
        }

        leitor.close();
    }
}
