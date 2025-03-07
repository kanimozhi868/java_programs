import java.util.Scanner;

 class countdigits {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
  
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
  
        int count = 0;
        if (number == 0) 
        {
            count = 1;
        } 
        else 
        {
   
            for (int temp = number; temp != 0; temp /= 10) {
                count++;
            }
        }
        
 
        System.out.println("The number of digits in " + number + " is: " + count);
    }
}