import java.util.Scanner;

public class InputsJava{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int n = scan.nextInt();

        System.out.printf("Você inseriu o número: %d%n", n);
        System.out.printf("Parabéns!!");
    }
}