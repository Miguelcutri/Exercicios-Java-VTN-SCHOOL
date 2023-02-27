import java.util.Scanner;

public class Quinzena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("digite o dia do mês: ");
        int dia = input.nextInt();

        if (dia <= 15) {
            System.out.println("estamos na primeira quinzena do mês.");
        } else {
            System.out.println("estamos na segunda quinzena do mês.");
        }
    }
}