import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę do obliczenia silni: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Silnia nie jest zdefiniowana dla liczb ujemnych!");
        } else {
            long silnia = 1; 

            for (int i = 1; i <= n; i++) {
                silnia *= i;
            }

            System.out.println("Wynik: " + n + "! = " + silnia);
        }

        scanner.close();
    }
}