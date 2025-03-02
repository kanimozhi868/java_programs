import java.util.Scanner;
class marks
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter your mark");
int m = obj.nextInt();
if(m>=90 && m<=100)
{
System.out.println("Grade A");
}
else if(m>=80 && m<=89)
{
System.out.println("Grade B");
}
else if(m>=70 && m<=79)
{
System.out.println("Grade C");
}
else if(m>=60 && m<=69)
{
System.out.println("Grade D");
}
else
{
System.out.println("Fail");
}
}
}