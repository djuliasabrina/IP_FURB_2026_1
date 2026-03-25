import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();
        numero = numero % 2;

        if(numero == 0){
            System.out.println("Número é par");
        }
        else{
            System.out.println("Número é ímpar");
        }

        leitor.close();
    }
}
