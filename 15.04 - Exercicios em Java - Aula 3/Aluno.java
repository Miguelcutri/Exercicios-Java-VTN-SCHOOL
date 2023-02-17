import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {

        // Lendo o nome e a idade do aluno
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idade = input.nextInt();

        // Lendo as notas do aluno
        System.out.print("Digite a nota do 1º bimestre: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a nota do 2º bimestre: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite a nota do 3º bimestre: ");
        double nota3 = input.nextDouble();
        System.out.print("Digite a nota do 4º bimestre: ");
        double nota4 = input.nextDouble();

        // Calculando a média anual do aluno
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Imprimindo os dados do aluno
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade + " anos");
        System.out.println("Notas do aluno: ");
        System.out.println("- 1º bimestre: " + nota1);
        System.out.println("- 2º bimestre: " + nota2);
        System.out.println("- 3º bimestre: " + nota3);
        System.out.println("- 4º bimestre: " + nota4);
        System.out.println("Média anual do aluno: " + media);

        // Fechando o scanner
        input.close();
    }
}
