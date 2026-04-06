import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int idade_1 = leitor.nextInt();
        int idade_2 = leitor.nextInt();
        int idade_3 = leitor.nextInt();

        if(idade_1 == idade_2 && idade_1 == idade_3 && idade_2 == idade_3){
            System.out.println("TRIGÊMEOS");
        }
        else if(idade_1 == idade_2 || idade_1 == idade_3 || idade_2 == idade_3){
            System.out.println("GEMÊOS");
        }
        else{
            System.out.println("APENAS IRMÃOS");
        }

        leitor.close();
    }
}
