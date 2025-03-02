import java.util.Scanner;
class relational
{
public static void main(String[] args)
{
Scanner value= new Scanner(System.in);
System.out.println("Enter value for a");
int a = value.nextInt();

System.out.println("Enter value for b");
int b = value.nextInt();
if(a==b)
{
System.out.println("a and b is equal");
}
else if(a<b)
{
System.out.println("a is less then b");
}
else
{
System.out.println("a is greater then b");
}
}
}