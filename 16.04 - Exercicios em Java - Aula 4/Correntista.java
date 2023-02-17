import java.util.Scanner;

public class Correntista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("digite o nome:");
        String nome = input.nextLine();
        System.out.print("digite a agência: ");
        int agencia = input.nextInt();
        System.out.print("digite a conta: ");
        int conta = input.nextInt();

        System.out.println("nome: " + nome);
        System.out.println("agc: " + agencia);
        System.out.println("conta: " + conta);


        input.close();
    }
}
