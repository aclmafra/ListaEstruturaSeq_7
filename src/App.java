import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double l, a;

        System.out.println("Digite o valor do lado de seu respectivo quadrado: ");
        l = sc.nextDouble();
        a = l * l;

        System.out.println("O valor da area deste quadrado e igual a: " + a);
        System.out.println("O dobro da area deste quadrado e igual a: " + (a * 2));

        sc.close();
    }
}
