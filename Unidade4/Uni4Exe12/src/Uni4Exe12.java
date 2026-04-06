import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int lado1 = leitor.nextInt();
        int lado2 = leitor.nextInt();
        int lado3 = leitor.nextInt();

        int soma1 = lado1 + lado2;
        int soma2 = lado2 + lado3;
        int soma3 = lado1 + lado3;

        if(lado1 < soma2 && lado2 < soma3 && lado3 < soma1){
        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("É equilátero.");
        }
        else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("É isóceles.");
        }
        else{
            System.out.println("É escaleno.");
        }
        }
         else{
            System.out.println("Não formam um triangulo.");
        }

        leitor.close();
    }
}
