import java.util.Scanner;

 class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. option 1");
            System.out.println("2. option 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("your choice option 1");
            } else if (choice == 2) {
                System.out.println("your choice option 2");
            } else if (choice == 3) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
         while (choice != 3);{

        
    }
}
 }