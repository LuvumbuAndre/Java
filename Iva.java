import java.util.Scanner;

public class Iva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Importa java.util.Scanner no início do ficheiro para fazer a interação com o app

        System.out.print("Produto: ");
        String nome = scanner.nextLine();// lê uma linha de texto

        System.out.print("Preco sem IVA: ");
        double preco = scanner.nextDouble();// Lê um número decimal

        System.out.print("Quantidade: ");
        int qtd = scanner.nextInt();// lê um valor inteiro

        double subtotal = preco * qtd;
        double iva = subtotal * 0.14;
        double total = subtotal + iva;
        System.out.println("Produto: " + nome);
        /* Println imprime e faz a quebra de linha de forma automática
        + nome faz a concatenação dentro do código
        */
        System.out.printf("Subtotal: %.2f Kz%n", subtotal);// %n -> quebra de linha
        System.out.printf("IVA (14%%): %.2f Kz%n", iva);
        System.out.printf("Total: %.2f Kz%n", total);
        scanner.close();
    }
}
