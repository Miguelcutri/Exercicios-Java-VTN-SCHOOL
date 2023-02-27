import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite o preço do produto: ");
        double preco = input.nextDouble();
        double desconto;

        if (preco < 30.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.2;}
        double precoComDesconto = preco - desconto;
        System.out.printf("o desconto aplicado foi de R$ %.2f. O preço final com desconto é R$ %.2f.", desconto, precoComDesconto);
    }
}
