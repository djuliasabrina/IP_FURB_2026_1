import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe29 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite o primeiro numero: ");
        int num1 = leitor.nextInt();
        System.out.println("Escolha uma dessas operações (+,-, /, *): ");
        char simbolo = leitor.next().charAt(0);
        System.out.println("Digite o segundo numero: ");
        int num2 = leitor.nextInt();


        switch (simbolo) {
            case '+':
                int soma = num1 + num2;
                System.out.println(soma);
                break;

            case '-':
                int diferenca = num1 - num2;
                System.out.println(diferenca);
                break;

            case '/':
                if(num2 != 0){
                double divisao = (double) num1 / num2; // (double) transforma os inteiros em double
                System.out.println(df.format(divisao));
                } else{
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;

            case '*':
                int produto = num1 * num2;
                System.out.println(produto);
                break;

            default:
                System.out.println("Operação inválida!");
                break;
        }

        leitor.close();

    }
}
