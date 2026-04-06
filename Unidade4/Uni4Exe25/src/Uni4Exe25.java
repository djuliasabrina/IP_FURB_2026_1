import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int valor1 = leitor.nextInt();
        System.out.println("Valor 2: ");
        int valor2 = leitor.nextInt();

        System.out.println("1 - Soma de dois números.\r\n" +
                "2 - Diferença entre dois números.\r\n" +
                "3 - Produto entre dois números.\r\n" +
                "4 - Divisão entre dois números (o denominador não pode ser zero).");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                int soma = valor1 + valor2;
                System.out.println(soma);
                break;

            case 2:
                int diferenca = valor1 - valor2;
                System.out.println(diferenca);
                break;

            case 3:
                int produto = valor1 * valor2;
                System.out.println(produto);
                break;

            case 4:
                int divisao = valor1 / valor2;
                System.out.println(divisao);
                break;

            default:
                System.out.println("Opção Inválida!");
                break;
        }
        leitor.close();
    }
}
