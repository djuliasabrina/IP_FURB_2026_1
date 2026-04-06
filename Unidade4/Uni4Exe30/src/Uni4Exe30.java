import java.util.Scanner;

public class Uni4Exe30 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        double saldo = 1000.0;

        System.out.println("=====================================");
        System.out.println("\nMENU:");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = leitor.nextInt();
        System.out.println("=====================================");

        switch (opcao) {
            case 1:
                System.out.println("O seu saldo é de R$:" + saldo);
                break;

            case 2:
                System.out.println("Digite o valor que deseja depositar: ");
                double deposito = leitor.nextDouble();
                if (deposito > 0) {
                    saldo = saldo + deposito;
                    System.out.println("Deposito realizado com sucesso. Seu saldo atual é de R$:" + saldo);
                } else {
                    System.out.println("Valor de deposito inválido!!!");
                }
                break;

            case 3:
                System.out.println("Digite o valor que deseja sacar: ");
                double saque = leitor.nextDouble();
                if (saque > 0 && saque <= saldo) {
                    saldo = saldo - saque;
                    System.out.println("Saque realizado com sucesso. Seu saldo atual é de R$:" + saldo);
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido.");
                }
                break;

            case 4:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

        leitor.close();
    }
}
