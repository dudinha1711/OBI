import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        String limpa = entrada.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String invertida = new StringBuilder(limpa).reverse().toString();

        if (limpa.equals(invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}