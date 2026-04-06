import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        char letra = leitor.next().charAt(0);

        if(letra == 'M'){
            System.err.println("Masculino");
        }
        else if(letra == 'F'){
            System.out.println("Feminino");
        }
        else if(letra == 'I'){
            System.out.println("Não informado");
        }
        else{
            System.out.println("Entrada Incorreta");
        }

        leitor.close();
    }
}
