import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String modificada = frase.replaceAll("(?i)[aeiou]", "*");
        System.out.println("Frase modificada: " + modificada);
    }
}