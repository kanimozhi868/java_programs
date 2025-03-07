import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num <= 1) {
            System.out.println("Not Prime.");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("Not Prime.");
                    return;
                }
            }
            System.out.println("Prime.");
        }
    }
}