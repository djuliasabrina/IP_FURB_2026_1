import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        float hrsTrabalhadas = leitor.nextFloat();
        float vlrHora = leitor.nextFloat();
        int hrsMes = 160;
        float salario = (hrsTrabalhadas * vlrHora);

        if(hrsTrabalhadas > hrsMes){
            float hrsExtra = hrsTrabalhadas - 160;
            float vlrExtra = hrsExtra * (vlrHora * 0.5f);
            salario = salario + vlrExtra;
            System.out.println("O salário total é: " + salario);
        }


        leitor.close();
    }
}
