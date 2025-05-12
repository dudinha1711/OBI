import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        String semEspacos = entrada.replace(" ", "");
        System.out.println("Número de caracteres (sem espaços): " + semEspacos.length());
    }
}