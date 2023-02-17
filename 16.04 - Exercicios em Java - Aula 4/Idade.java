import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("digite o ano atual: ");
        int anoAtual = in.nextInt();
        System.out.print("digite o ano de nascimento: ");
        int anoNascimento = in.nextInt();


        int idade = anoAtual - anoNascimento;

        System.out.println("Idade: " + idade + " anos");
        in.close();
    }
}
