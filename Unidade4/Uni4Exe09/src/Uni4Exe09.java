import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int resultado = num1 % num2;

        if(resultado == 0){
            System.out.println("Os valores são múltiplos.");
        }
        else{
            System.out.println("Os valores não são múltiplos.");
        }

        leitor.close();
    }
}
