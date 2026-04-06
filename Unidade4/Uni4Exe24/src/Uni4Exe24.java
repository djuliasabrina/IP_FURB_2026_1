import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int valor1 = leitor.nextInt();
        System.out.println("Valor 2: ");
        int valor2 = leitor.nextInt();
        System.out.println("Valor 3: ");
        int valor3 = leitor.nextInt();

        System.out.println("opção = 1, os 3 valores em ordem crescente\n" +
                "opção = 2, os 3 valores em ordem decrescente\n" +
                "opção = 3, os 3 valores de forma que o maior valor fique no meio");
        System.out.println("Opção: \n");
        int opcao = leitor.nextInt();

        // maior, menor, meio
        int maior;
        int menor;

        // MAIOR
        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }

        // MENOR
        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
        } else {
            menor = valor3;
        }

        // MEIO
        int meio = valor1 + valor2 + valor3 - maior - menor;

        switch (opcao) {
            case 1:
                System.out.println(menor + " " + meio + " " + maior);
                break;

            case 2:
                System.out.println(maior + " " + meio + " " + menor);
                break;

            case 3:
                System.out.println(menor + " " + maior + " " + meio);
                break;

            default:
                System.out.println("Opção Inválida!");
                break;
        }

        leitor.close();
    }
}
