import java.util.Scanner;

public class Votação {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("informe a idade da pessoa: ");
        int idade = input.nextInt();

        String status = (idade >= 18 && idade <= 70 && idade >= 18) ? "obrigatório" : "opcional";
        System.out.println("o voto é " + status + ".");
    }
}