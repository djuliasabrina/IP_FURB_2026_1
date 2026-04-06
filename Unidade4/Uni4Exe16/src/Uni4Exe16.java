import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Idade dos homens: ");
        int homen1 = leitor.nextInt();
        int homen2 = leitor.nextInt();

        System.out.println("Idade das mulheres: ");
        int mulher1 = leitor.nextInt();
        int mulher2 = leitor.nextInt();

        int homemMaisVelho;
        int homemMaisNovo;
        int mulherMaisVelha;
        int mulherMaisNova;

        // Homens
        if (homen1 > homen2) {
            homemMaisVelho = homen1;
            homemMaisNovo = homen2;
        } else {
            homemMaisVelho = homen2;
            homemMaisNovo = homen1;
        }

        // Mulheres
        if (mulher1 > mulher2) {
            mulherMaisVelha = mulher1;
            mulherMaisNova = mulher2;
        } else {
            mulherMaisVelha = mulher2;
            mulherMaisNova = mulher1;
        }

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);

        leitor.close();
    }
}
