import java.util.Scanner;
class numbers
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter the number");
int a = obj.nextInt();
if(a<0)
{
System.out.println("The number is negative");
}
else if(a>0)
{
System.out.println("The number is positive");
}
else
{
System.out.println("The number is zero");
}
}
}