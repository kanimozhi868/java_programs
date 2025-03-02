import java.util.Scanner;

class vote
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter your age");
int age = obj.nextInt();
if(age>=18)
{
System.out.println("your are eligible to vote");
}
else
{
System.out.println("your are not eligible to vote");
}
}
}