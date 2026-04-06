import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Dia: ");
        int dia = leitor.nextInt();
        System.out.println("Mês: ");
        int mes = leitor.nextInt();
        System.out.println("Ano: ");
        int ano = leitor.nextInt();

        int bissexto = ano % 4;

        if (mes >= 1 && mes <= 12) {

            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31)) {

                System.out.println("Válida");

            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30)) {

                System.out.println("Válida");

            } else if (mes == 2) {

                if ((bissexto == 0 && (dia >= 1 && dia <= 29)) || (bissexto != 0 && (dia >= 1 && dia <= 28))) {

                    System.out.println("Válida");
                } else {
                    System.out.println("Não válida");
                }

            } else {
                System.out.println("Não válida");
            }

        } else {
            System.out.println("Não válida");
        }

        leitor.close();
    }
}
