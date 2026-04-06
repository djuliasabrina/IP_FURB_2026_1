import java.util.Scanner;

public class Uni4Exe28 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 1 a 7: ");
        int num = leitor.nextInt();

        switch (num) {
            case 1:
                System.out.println("Domingo");
                break;
            
            case 2:
                System.out.println("Segunda-feira");
                break;

            case 3:
                System.out.println("Terça-feira");
                break;

            case 4:
                System.out.println("Quarta-feira");
                break;

            case 5:
                System.out.println("Quinta-feira");
                break;

            case 6:
                System.out.println("Sexta-feira");
                break;

            case 7:
                System.out.println("Sábado");
        
            default:
                System.out.println("Dia Inválido");
                break;
        }

        leitor.close();

    }
}
