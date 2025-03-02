import java.util.Scanner;

class operator
{
public static void main(String[] args)
{
Scanner value = new Scanner(System.in);
System.out.println("Enter value for a&b");
int a = value.nextInt();
int b = value.nextInt();
if(a%3==0&&a%5==0)
{
System.out.println("a is divisible by 3&5");
}
else
{
System.out.println("a is not divisible by 3&5");
}
}
}