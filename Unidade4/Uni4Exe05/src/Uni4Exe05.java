import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean resposta = leitor.nextBoolean();

        if(resposta == true){
            System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }

        leitor.close();
    }
}
