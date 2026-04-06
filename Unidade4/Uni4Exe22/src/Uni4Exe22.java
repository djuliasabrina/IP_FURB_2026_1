import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 1 para Ciência da Computação\n " +
                "2 para Licenciatura da Computação\n "
                + "3 para Sistemas de Informação");

        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;

            case 2:
                System.out.println("Licenciado em Computação");
                break;

            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
                
            default:
                System.out.println("Opção inválida");
                break;
        }

        leitor.close();

    }
}
