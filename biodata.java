import java.util.Scanner;

class biodata
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your reg.No ");
        int reg = obj.nextInt();
        System.out.println("your reg no is " + reg);

        obj.nextLine();
        System.out.println("Enter your name: ");
        String name = obj.nextLine();
        System.out.println("your name is " + name);

        System.out.println("Enter your initial: ");
        char ch = obj.next().charAt(0);
        System.out.println("your initial is " + ch);
        obj.nextLine();
        System.out.println("Enter your phone number: ");
        String phone = obj.nextLine();
        System.out.print("Enter your phone number: " + phone);
}
}