import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Dia do vencimento: ");
        int diaVencimento = leitor.nextInt();
        System.out.println("Dia do pagamento: ");
        int diaPagamento = leitor.nextInt();
        System.out.println("Valor da prestação: ");
        float vlrPrestacao = leitor.nextFloat();

        if(diaPagamento <= 10){
            float desconto = vlrPrestacao * 0.10f;
            vlrPrestacao = vlrPrestacao - desconto;
            System.out.println("O pagamento está em dia. O valor da prestação = R$" + vlrPrestacao);
        } 
        else if(diaPagamento >= 11 && diaPagamento <= 15){
            System.out.println("O pagamento está atrasado. O valor da prestação = R$" + vlrPrestacao);
        } 
        else if(diaPagamento >= 16){
            diaPagamento = diaPagamento - 10;
            float multa = vlrPrestacao * (diaPagamento * 0.02f);
            vlrPrestacao = vlrPrestacao + multa;
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$" + vlrPrestacao);
        }


        leitor.close();
    }
}
