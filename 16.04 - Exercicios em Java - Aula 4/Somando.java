import java.util.Scanner;

public class Somando {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("sigite o primeiro valor: ");
        int a = in.nextInt();
        System.out.print("digite o segundo valor: ");
        int b = in.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma);

        in.close();
    }
}
