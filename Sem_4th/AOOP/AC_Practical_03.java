// Practical : 3 : Write a program in java to reverse the digits of a number using while loop.
import java.util.Scanner;
public class AC_Practical_3 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = sc.nextInt();
        int rem = 0,rev = 0;
        while(number != 0)
        {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        System.out.println("Reverse number is :"+rev);
    }
}
/*
Output:-
Enter Number :
1456
Reverse number is :6541
*/
