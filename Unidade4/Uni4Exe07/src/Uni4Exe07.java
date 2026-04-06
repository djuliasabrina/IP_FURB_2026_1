import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        float gramas = leitor.nextFloat();
        float vlrGrama = 0.45f;
        float vlrAdicional = 0.45f;
        
        if(gramas > 50){
            gramas = (gramas - 50) / 20;
            int resultado = (int) Math.ceil(gramas);
            float vlrFinal = (resultado * vlrAdicional) + vlrGrama;
            System.out.println(vlrFinal);
        }
        else{
            System.out.println(vlrGrama);
        
        }

        leitor.close();
    }
}
