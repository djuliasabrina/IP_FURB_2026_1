import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        if(num1 > num2){
            System.out.println("O valor " + num1 + " é maior do que o valor " + num2);
        }
        else{
            System.out.println("O valor " + num2 + " é maior do que o valor " + num1);
        }
        
        leitor.close();
    }
}
