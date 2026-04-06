import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Idade de Marquinhos: ");
        int idadeMarq = leitor.nextInt();

        System.out.println("Idade de Zezinho: ");
        int idadeZezi = leitor.nextInt();

        System.out.println("Idade de Luluzinha: ");
        int idadeLulu = leitor.nextInt();

        if(idadeMarq < idadeZezi && idadeMarq < idadeLulu){
            System.out.println("O Marquinhos é o caçula.");
        }
        else if(idadeZezi < idadeMarq && idadeZezi < idadeLulu ){
            System.out.println("O Zezinho é o caçula.");
        }
        else{
            System.out.println("A Luluzinha é a caçula.");
        }

        leitor.close();
    }
}
