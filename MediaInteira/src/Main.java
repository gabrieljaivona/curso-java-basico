import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int a = scanner.nextInt();

        System.out.println("Digite outro valor: ");
        int b = scanner.nextInt();

        int media = (a + b)/2;
        System.out.println(media);
    }
}
