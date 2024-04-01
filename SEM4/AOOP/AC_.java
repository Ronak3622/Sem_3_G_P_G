//Write a program that reads an integer between 0 and 1000 and adds all the digits in integer. For example if an integer is 931 then sum is 13.
import java.util.Scanner;
 public class AC_{
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number between 0 and 1000");
     int number = sc.nextInt();
    
     if  (number<0 || number>1000) {
         System.out.println("invalid number");
     }
     else {
         int sum = 0;
         int originalNumber = number;

         while(originalNumber!=0){
           int  digit = originalNumber % 10;
         sum = sum + digit;
         originalNumber /=10;

         }
         System.out.println("sum of digits of " + number + " is " + sum );
     }
     }
 }
/*
Output:
Enter number between 0 and 1000
931
sum of digits of 931 is 13
*/
