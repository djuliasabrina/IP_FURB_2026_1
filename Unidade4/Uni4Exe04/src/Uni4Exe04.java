import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        double numero = leitor.nextDouble();

        if(numero % 1 == 0){
            System.out.println("Casas decimais não foram digitadas.");
        }
        else{
            System.out.println("Casas decimais foram digitadas.");
        }

        // OUTRA FORMA
        //  while (numero > 0) {
        //     numero = numero - 1;
        // }

        // if(numero == 0){
        //     System.out.println("Casas decimais não foram digitadas.");
        // }
        // else{
        //     System.out.println("Casas decimais foram digitadas.");
        // }
        
        leitor.close();
    }
}
