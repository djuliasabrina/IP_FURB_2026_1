import java.util.Scanner;

public class Uni3Exe12 {

    // Análise: ok
    // Entradas: nome, hrsTrabalhadas, numDependentes
    // Saída: salarioBruto, salarioLiquido
    // Processo:
    // float salarioTrabalho = hrsTrabalhadas * 10;
    // float salarioFamilia = numDependentes * 60;
    // float salarioBruto = salarioFamilia + salarioTrabalho;
    // float descontoInss = salarioTrabalho * 0.085f;
    // float descontoImposto = salarioTrabalho * 0.05f;
    // float salarioLiquido = salarioBruto - descontoImposto - descontoInss;
    // Fluxograma:

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a quantidade de horas trabalhadas pelo funcionário: ");
        float hrsTrabalhadas = leitor.nextFloat();

        System.out.print("Digite a quantidade de dependentes do funcionário: ");
        int numDependentes = leitor.nextInt();

        float salarioTrabalho = hrsTrabalhadas * 10;
        float salarioFamilia = numDependentes * 60;
        float salarioBruto = salarioFamilia + salarioTrabalho; 
        float descontoInss = salarioTrabalho * 0.085f;
        float descontoImposto = salarioTrabalho * 0.05f;
        float salarioLiquido = salarioBruto - descontoInss - descontoImposto;

        System.out.print("O funcionário " + nome + " possui um salário bruto de R$" + salarioBruto
                + " e um salário líquido de R$" +
                salarioLiquido);

        leitor.close();
    }
}