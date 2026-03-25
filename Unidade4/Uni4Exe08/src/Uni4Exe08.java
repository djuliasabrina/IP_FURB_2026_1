import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = leitor.nextLine().toLowerCase().charAt(0);
        

        if(letra == 'a' || letra ==  'e' || letra == 'i' || letra ==  'o' ||  letra ==  'u'){
            System.out.println("É vogal");
        }
        else{
            System.out.println("NÃO é vogal");
        }
        leitor.close();

    }
}
