import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a, b, soma;

        System.out.println("Digite o primeiro número");
        a = scan.nextInt();

        System.out.println("Digite o secundo número");
        b = scan.nextInt();

        soma = a+b;
        System.out.println("O resultado da soma é:\n" + soma);
        scan.close();
    }
}
