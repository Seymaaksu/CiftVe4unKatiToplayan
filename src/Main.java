import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, total = 0;
        System.out.print("Sayı giriniz: ");
        number = scan.nextInt();
        if (number % 2 == 1) {
            for (int i = 0; i <= number; i++) {
                if (i % 4 == 0)
                    total += i;
            }
        }
        System.out.println("Toplam: " + total);
    }
}