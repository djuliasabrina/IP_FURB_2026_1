import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("T: calcular a área de um triângulo de base b e altura h\r\n" + //
                "Q: calcular a área de um quadrado de lado l\r\n" + //
                "R: calcular a área de um retângulo de base b e altura h\r\n" + //
                "C: calcular a área de um círculo de raio r");
        System.out.println("Opção: ");
        char opcao = leitor.next().charAt(0);
        float area;
        int b;
        int h;

        switch (opcao) {
            case 'T':
                System.out.println("Base: ");
                b = leitor.nextInt();
                System.out.println("Altura: ");
                h = leitor.nextInt();
                area = (b * h) / 2;
                System.out.println(area);
                break;

            case 'Q':
                System.out.println("Lado: ");
                int l = leitor.nextInt();
                area = l * l;
                System.out.println(area);
                break;

            case 'R':
                System.out.println("Base: ");
                b = leitor.nextInt();
                System.out.println("Altura: ");
                h = leitor.nextInt();
                area = b * h;
                System.out.println(area);
                break;

            case 'C':
                System.out.println("Raio: ");
                int r = leitor.nextInt();
                area = (r * r) * 3.14f;
                System.out.println(area);
                break;

            default:
                System.out.println("Opção Inválida!");
                break;
        }
        leitor.close();
    }
}
