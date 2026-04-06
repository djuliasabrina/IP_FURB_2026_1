import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Altura: ");
        float altura = leitor.nextFloat();
        System.out.println("Massa: ");
        float massa = leitor.nextFloat();

        float imc = massa / (altura * altura);
        String nivel;

        if(imc < 18.5){
            nivel = "Magreza";
        } else if(imc >= 18.5 && imc <= 24.9){
            nivel = "Saudável";
        } else if(imc >= 25.0 && imc <= 29.9){
            nivel = "Sobrepeso";
        } else if(imc >= 30.0 && imc <= 34.9){
            nivel = "Obesidade Grau I";
        } else if(imc >= 35.0 && imc <= 39.9){
            nivel = "Obesidade Grau II (severa)";
        } else{
            nivel = "Obesidade Grau III (mórbida)";
        }

        System.out.println("O grau de obesidade do indivíduo é: " + nivel);
        leitor.close();
    }
}
