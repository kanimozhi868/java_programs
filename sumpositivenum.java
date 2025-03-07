import java.util.Scanner;

 class sumpositivenum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            System.out.print("Enter a positive number (or a negative number to stop): ");
            num = scanner.nextInt();

            if (num > 0) {
                sum += num;
            }
        } while (num >= 0);{

    

        if (sum > 0) {
            System.out.println("The sum of the positive numbers is: " + sum);
        } else {
            System.out.println("No positive numbers were entered.");
        }}
    }
}