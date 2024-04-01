//Write a JAVA program to reverse 3-digit integer number. For example, number is 321 then its reverse is 123.
import java.util.Scanner;
public class AB_Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 digit nnumber");
        int number = sc.nextInt();

        if (number<100 && number>999) {
            System.out.println("Invalid number");
        }
        else{
            int reverse_number =0;
            int original_number = number;

            while (original_number !=0) {
                int digit = original_number % 10;
                reverse_number = reverse_number * 10 + digit;
                original_number /= 10;
            }
            System.out.println("reverse of " + number + " is " + reverse_number);
        }
    }
}
/*
Output:
Enter any 3 digit nnumber
123
reverse of 123 is 321
*/
