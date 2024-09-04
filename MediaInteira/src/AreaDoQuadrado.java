import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor de L
        System.out.print("Digite o valor de L: ");
        int L = scanner.nextInt();

        // Calcula a área do quadrado
        int area = L * L;

        // Imprime a área do quadrado
        System.out.println("A área do quadrado de lado " + L + " é: " + area);

        scanner.close();
    }
}
